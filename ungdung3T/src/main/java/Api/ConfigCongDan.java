package Api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ConfigCongDan {
    private Retrofit retrofit;
    private static ConfigCongDan instance;
    static final String BASE_URL = "https://localhost:8443";

    public static ConfigCongDan getInstance() {
        if (instance == null) {
            instance = new ConfigCongDan();
            instance.createRetrofit();
        }
        return instance;
    }

    private void createRetrofit() {
        httpClientBuilder = new OkHttpClient.Builder().readTimeout(5, TimeUnit.SECONDS);
        initSSL();
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClientBuilder.build())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
    private static OkHttpClient.Builder httpClientBuilder = null;

    private static void initSSL() {

        SSLContext sslContext = null;
        try {
            InputStream file = new FileInputStream("baeldung.p12");
            sslContext = createCertificate(file);
        } catch (CertificateException | IOException | KeyStoreException | KeyManagementException |
                 NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (sslContext != null) {
            httpClientBuilder.sslSocketFactory(sslContext.getSocketFactory(), systemDefaultTrustManager());
        }

    }

    private static SSLContext createCertificate(InputStream trustedCertificateIS) throws CertificateException, IOException, KeyStoreException, KeyManagementException, NoSuchAlgorithmException {

        String keyStoreType = KeyStore.getDefaultType();
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(trustedCertificateIS, "050711Bm".toCharArray());
//        keyStore.setCertificateEntry("ca", ca);

        // creating a TrustManager that trusts the CAs in our KeyStore
        String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
        tmf.init(keyStore);

        // creating an SSLSocketFactory that uses our TrustManager
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);
        return sslContext;

    }

    private static X509TrustManager systemDefaultTrustManager() {

        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException e) {
            throw new AssertionError(); // The system has no TLS. Just give up.
        }

    }
}

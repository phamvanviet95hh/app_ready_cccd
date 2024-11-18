package Api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit {
    private Retrofit retrofit;
    private static ConfigRetrofit instance;
    static final String BASE_URL = "https://api.gwork.vn";

    public static ConfigRetrofit getInstance() {
        if (instance == null) {
            instance = new ConfigRetrofit();
            instance.createRetrofit();
        }
        return instance;
    }
    private void createRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
    public Retrofit getRetrofit() {
        return retrofit;
    }
}

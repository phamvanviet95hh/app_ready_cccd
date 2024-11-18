package Api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigData {
    private static String CONFIG_PATH = "C:\\EID\\Export\\test.txt";
    public static void saveProp(String title, String value) {
        Properties currentProperties = new Properties();
        try ( InputStream input = new FileInputStream(CONFIG_PATH)) {
            currentProperties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Update properties with new values
        currentProperties.setProperty(title, value);

        // Save updated properties back to file
        try ( FileOutputStream output = new FileOutputStream(CONFIG_PATH)) {
            currentProperties.store(output, "Updated Account Information");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

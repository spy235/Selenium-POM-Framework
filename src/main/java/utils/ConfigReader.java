package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop;

    public static Properties getProperties() {
        if (prop == null) {
            try {
                prop = new Properties();
                FileInputStream fis = new FileInputStream("src/main/java/config/config.properties");
                prop.load(fis);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return prop;
}
}

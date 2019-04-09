package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    public static Object fetchPropertlyValue(String key) throws IOException {

        FileInputStream file = new FileInputStream("C:/Users/rgologan/Workspace/auto/automation/src/resources/config.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key);
    }
}

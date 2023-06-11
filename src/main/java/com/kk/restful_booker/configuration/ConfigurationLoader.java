package com.kk.restful_booker.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationLoader {
    private static final String CONFIG_FILE_PATH = "config.properties";

    public static Properties loadConfig() throws IOException {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
            properties.load(input);
        }
        return properties;
    }
}

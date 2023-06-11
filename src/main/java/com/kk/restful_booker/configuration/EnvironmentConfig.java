package com.kk.restful_booker.configuration;

import java.io.IOException;
import java.util.Properties;

public class EnvironmentConfig {

    private static final String ENVIRONMENT_PROPERTY = "environment";
    private static final String DEFAULT_ENVIRONMENT = "development";

    private final Properties configProperties;

    public EnvironmentConfig() throws IOException {
        configProperties = ConfigurationLoader.loadConfig();
    }

    public String getEnvironment() {
        return configProperties.getProperty(ENVIRONMENT_PROPERTY, DEFAULT_ENVIRONMENT);
    }

    // Other methods to retrieve specific configuration properties
    // ...

    // Example method to retrieve API base URL
    public String getApiBaseUrl() {
        return configProperties.getProperty("api.baseurl");
    }

}

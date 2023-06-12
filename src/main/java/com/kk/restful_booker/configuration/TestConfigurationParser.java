package com.kk.restful_booker.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class TestConfigurationParser {

    public TestConfiguration readConfiguration(String filePath) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        TestConfiguration testConfiguration = objectMapper.readValue(new File(filePath), TestConfiguration.class);
        System.out.println(testConfiguration.getServerUrl());
        return testConfiguration;
    }

}

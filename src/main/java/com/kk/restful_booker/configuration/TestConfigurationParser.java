package com.kk.restful_booker.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class TestConfigurationParser {

    private static final Logger logger = LoggerFactory.getLogger(TestConfigurationParser.class);

    public TestConfiguration readConfiguration(String filePath) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        TestConfiguration testConfiguration = objectMapper.readValue(new File(filePath), TestConfiguration.class);
        logger.debug(testConfiguration.getServerUrl());
        return testConfiguration;
    }

}

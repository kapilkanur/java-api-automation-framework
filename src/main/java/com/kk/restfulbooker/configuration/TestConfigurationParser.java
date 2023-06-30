package com.kk.restfulbooker.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class TestConfigurationParser {

    private static final Logger LOG = LoggerFactory.getLogger(TestConfigurationParser.class);

    /**
     * Reads the configuration file.
     * @param filePath File path for test configuration
     * @throws Exception
     */
    public void readConfiguration(final String filePath) throws Exception {

        final ObjectMapper objectMapper = new ObjectMapper();
        final TestConfiguration testConfiguration = objectMapper.readValue(new File(filePath), TestConfiguration.class);
        String serverUrl = testConfiguration.getServerUrl();
        LOG.debug(serverUrl);
    }

}

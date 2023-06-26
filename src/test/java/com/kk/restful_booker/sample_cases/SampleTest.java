package com.kk.restful_booker.sample_cases;

import base_classes.RestfulBookerBaseClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SampleTest extends RestfulBookerBaseClass {

    private static final Logger logger = LoggerFactory.getLogger(SampleTest.class);

    @Test
    public void firstTest() {
        logger.info("First Test");

    }

}

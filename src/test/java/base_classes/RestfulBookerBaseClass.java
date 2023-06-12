package base_classes;

import com.kk.restful_booker.configuration.TestConfiguration;
import com.kk.restful_booker.configuration.TestConfigurationParser;
import org.testng.annotations.BeforeSuite;

public abstract class RestfulBookerBaseClass {

    @BeforeSuite
    public void setUp() throws Exception {
        loadTestConfiguration();
    }

    private TestConfiguration loadTestConfiguration() throws Exception {
        return new TestConfigurationParser().readConfiguration("src/test/resources/configuration/test_configuration.json");
    }

}

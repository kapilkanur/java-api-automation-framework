package base_classes;

import com.kk.restfulbooker.configuration.TestConfigurationParser;
import org.testng.annotations.BeforeSuite;

public abstract class RestfulBookerBaseClass {

    @BeforeSuite
    public void setUp() throws Exception {
        loadTestConfiguration();
    }

    private void loadTestConfiguration() throws Exception {
        new TestConfigurationParser().readConfiguration("src/test/resources/configuration/test_configuration.json");
    }

}

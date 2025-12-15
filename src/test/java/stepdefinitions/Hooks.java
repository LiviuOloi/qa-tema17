package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void setup() {

        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://test.hapifyme.com";
        Configuration.browserSize = "1920x1080";

    }

    @After
    public void tearDown() {

        closeWebDriver();

    }
}
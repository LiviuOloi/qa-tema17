package stepdefinitions;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Condition.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;


import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;


public class LoginSteps {


    private LoginPage loginPage = new LoginPage();


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openPage();
    }


    @When("I login with username {string} and password {string}")
    public void iLoginWithUsernameAndPassword(String user, String pass) {
        loginPage.login(user, pass);

    }


    @Then("I should see {string}")
    public void iShouldSee(String result) {

        if (result.equalsIgnoreCase("Success")) {
            String currentUrl = webdriver().driver().url();
            assertTrue("Expected to be logged in", currentUrl.contains("/index.php"));
        } else {

            $("body").shouldHave(Condition.text(result));

        }
    }
}
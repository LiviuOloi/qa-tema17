package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ProfilePage;


import static org.junit.Assert.*;


public class ProfileSteps {


    private ProfilePage profilePage = new ProfilePage();
    private LoginPage loginPage = new LoginPage();


    @Given("I am logged in with {string} and password {string}")
    public void iAmLoggedIn(String user, String pass) {
        loginPage.openPage();
        loginPage.login(user, pass);
    }


    @When("I search for user {string} with id {string}")
    public void iSearchForUser(String user, String profile) {
        profilePage.searchUser(user, profile);
    }


    @Then("I should see the profile page for {string}")
    public void iShouldSeeTheProfilePageFor(String user) {
        assertFalse("Not on profile page", profilePage.isOnProfile(user));
    }
}
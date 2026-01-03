package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.PostPage;
import pages.LoginPage;
import java.util.Map;



import static org.junit.Assert.*;

public class PostSteps {


    private LoginPage loginPage = new LoginPage();
    private PostPage postPage = new PostPage();
    private String description;


    @Given("I am logged on the feed page as {string} with password {string}")
    public void iAmLoggedInAsWithPassword(String user, String pass) {
        loginPage.openPage();
        loginPage.login(user, pass);
    }


    @When("I create a new post with the following details:")
    public void iCreateANewPostWithTheFollowingDetails(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        String description = map.get("description");
        this.description = description;
        postPage.createPost(description);
    }


    @Then("the post should appear on the feed")
    public void thePostShouldAppearOnTheFeed() {
        assertTrue("Post not found on feed", postPage.isPostPresent(this.description));
    }
}

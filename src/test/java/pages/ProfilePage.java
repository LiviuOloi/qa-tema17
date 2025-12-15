package pages;


import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class ProfilePage {

    static String myProfile;
    private SelenideElement searchInput = $("#search_text_input");


    public void searchUser(String user, String profile) {
        searchInput.setValue(user);
        myProfile = "a[href='" + profile + "']";
        $(myProfile).click();

    }


    public boolean isOnProfile(String user) {
        return $(myProfile).getText().contains(user);
    }
}
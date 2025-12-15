package pages;


import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;


public class PostPage {



    private SelenideElement newPostDescription = $("#post_text");
    private SelenideElement createPostButton = $("#post_button");


    public void createPost(String description) {

        newPostDescription.setValue(description);
        createPostButton.click();
    }


    public boolean isPostPresent(String id) {
        return $(".post_body_content").getText().contains(id);
    }
}
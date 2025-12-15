package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {


    private By emailInput = By.name("log_email");
    private By passwordInput = By.name("log_password");
    private By loginButton = By.name("login_button");


    public void openPage() {
        open("/login_register.php");
    }

    public void login(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
        $(loginButton).click();
    }
}
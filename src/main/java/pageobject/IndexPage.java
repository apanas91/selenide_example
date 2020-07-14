package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
    @FindBy(id = "login_field")
    SelenideElement loginField;
    @FindBy(id = "password")
    SelenideElement passwordField;
    @FindBy(name = "commit")
    SelenideElement submitButton;

    public IndexPage typeLogin(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public IndexPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public void clickSubmit() {
        submitButton.click();
    }
}

package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='passp-field-login']")
    WebElement inputUsername;

    @FindBy(xpath = "//div[@class='passp-button passp-sign-in-button']")
    WebElement btnCheckUsernameExist;

    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    WebElement inputPassword;

    @FindBy(xpath = "//div[@class='passp-button passp-sign-in-button']")
    WebElement btnLogin;

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public HomePage login(String username, String password) {
        inputUsername.sendKeys(username);
        btnCheckUsernameExist.click();
        inputPassword.sendKeys(password);
        btnLogin.click();
        duration(2000);
        return new HomePage();
    }
}

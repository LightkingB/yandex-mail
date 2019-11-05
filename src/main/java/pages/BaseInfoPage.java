package pages;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseInfoPage extends TestBase {
    public BaseInfoPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-reactid='24']")
    private WebElement forwardLoginPageLink;

    public String verifyLoginPageTitle() {
        return driver.getTitle();
    }

    public LoginPage clickOnForwardLoginPageLink() {
        forwardLoginPageLink.click();
        return new LoginPage();
    }

}

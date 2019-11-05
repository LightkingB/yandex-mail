package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='mail-ComposeButton js-main-action-compose']")
    WebElement sendEmailLink;

    @FindBy(xpath = "//div[@name='to']")
    WebElement to;

    @FindBy(xpath = "//input[@name='subj-fb504bce04f9c1899dca45dce8fd536b36a28e7a']")
    WebElement theme;

    @FindBy(xpath = "//div[@id='cke_58_contents']")
    WebElement messageText;


    public void clickSendEmailLink() {
        duration(3000);
        sendEmailLink.click();
    }

    public void fillRequiredFields(){
        duration(3000);
        to.sendKeys("mr_nurs.94@inbox.ru");
        theme.sendKeys("Selenium auto test");
        messageText.sendKeys("You done!");
        duration(2000);
    }
}

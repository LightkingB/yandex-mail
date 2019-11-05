import base.TestBase;
import junit.framework.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseInfoPage;
import pages.HomePage;
import pages.LoginPage;


public class HomePageTest extends TestBase {
    private HomePage homePage;
    public HomePageTest() {
        super();
        homePage = new HomePage();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }
    @Test(description = "Open email fields")
    public void clickWriteEmailLink(){

        homePage.clickSendEmailLink();
    }
    @Test(description = "Open email fields")
    public void fillRequiredFields(){
        homePage.fillRequiredFields();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (driver != null) {
            driver.quit();
        }
    }

}

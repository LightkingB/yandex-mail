import base.TestBase;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseInfoPage;
import pages.LoginPage;
import util.TestUtil;

public class BaseInfoPageTest extends TestBase {
    private BaseInfoPage baseInfoPage;

    public BaseInfoPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        baseInfoPage = new BaseInfoPage();

    }

    @Test(description = "Go to Login page Yandex Mail")
    public void forwardLoginPageTest() {
        baseInfoPage.clickOnForwardLoginPageLink();
        String title = baseInfoPage.verifyLoginPageTitle();
        Assert.assertEquals(title, "Авторизация");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (driver != null) {
            driver.quit();
        }
    }

}

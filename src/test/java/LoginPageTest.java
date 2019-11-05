import base.TestBase;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }



    @Test(description = "Login", groups = {"login"})
    public void loginTest() {
        loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
        String title = loginPage.verifyHomePageTitle();
        Assert.assertEquals(title, "Яндекс.Почта");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (driver != null) {
            driver.quit();
        }
    }

}

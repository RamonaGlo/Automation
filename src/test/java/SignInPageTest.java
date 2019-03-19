import framework.singin.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {

    private LoginPage loginPage;

    @BeforeMethod
    public void init() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        loginPage = new LoginPage(driver);
        loginPage.goTo();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        loginPage.signOut();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void successfulLogin() throws InterruptedException {
        String loginPageHeading = loginPage.getHeadingValue();
        Assert.assertEquals(loginPageHeading, "AUTHENTICATION");
        loginPage.login("rgologan@pentalog.com", "123456789");
        Thread.sleep(4000);
        String currentHeading = loginPage.getHeadingValue();
        Assert.assertEquals(currentHeading, "MY ACCOUNT");
    }

    @Test(priority = 1)
    public void invalidLogin() throws InterruptedException {
        //TODO can throw error (element not present)
        Boolean isErrorDispalyed = loginPage.isErrorDispalyed();
        Assert.assertFalse(isErrorDispalyed);
        loginPage.login("rgologan@pentalog.com", "12345678");
        Thread.sleep(4000);
        isErrorDispalyed = loginPage.isErrorDispalyed();
        Assert.assertTrue(isErrorDispalyed);
    }


}

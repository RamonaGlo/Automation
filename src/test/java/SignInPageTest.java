import framework.Utility;
import framework.singin.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInPageTest extends TestBase {

    private LoginPage loginPage;

    @BeforeMethod
    public void init() throws InterruptedException, IOException {
        driver.get(Utility.fetchPropertlyValue("applicationURL").toString());
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

    @Test(priority = 2)
    public void invalidLogin() throws InterruptedException {
        //TODO can throw error (element not present)
//        Boolean isErrorDispalyed = loginPage.isErrorDispalyed();
//        Assert.assertFalse(isErrorDispalyed);
        loginPage.login("rgologan@pentalog.com", "1234567");
        Thread.sleep(4000);
        Boolean isErrorDispalyed = loginPage.isErrorDispalyed();
        Assert.assertTrue(isErrorDispalyed);
    }


}

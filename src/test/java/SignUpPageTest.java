import framework.signup.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {

    private SignUpPage signUpPage;

    @BeforeMethod
    public void init() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        signUpPage = new SignUpPage(driver);
        signUpPage.goTo();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        signUpPage.signOut();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void successfullSignUp() throws InterruptedException {
        String signUpPageHeading = signUpPage.getHeadingValue();
        Assert.assertEquals(signUpPageHeading, "AUTHENTICATION");
        signUpPage.checkEmail("rgologanssx@pentalog.com")
                    .selectTitle("Mrs")
                    .addFirstName("Ramona")
        .signUp( "Mihai","", "123456789","","","Str.Ciurchi nr 126-128","Iasi","90001","0125478962","asasfas@asddasdfa.com");


//        signUpPage.signUp( "Mihai","", "123456789","","","Str.Ciurchi nr 126-128","Iasi","90001","0125478962","asasfas@asddasdfa.com");
        Thread.sleep(4000);
        String currentHeading = signUpPage.getHeadingValue();
        Assert.assertEquals(currentHeading, "MY ACCOUNT");
    }

    @Test(priority = 2)
    public void invalidSignUp() throws InterruptedException {
        //TODO can throw error (element not present)
//        Boolean isErrorDispalyed = loginPage.isErrorDispalyed();
//        Assert.assertFalse(isErrorDispalyed);
        signUpPage.create("rgologanss@pentalog.com");
        Thread.sleep(4000);
        Boolean isErrorDispalyed = signUpPage.isErrorDispalyed();
        Assert.assertTrue(isErrorDispalyed);
    }


}


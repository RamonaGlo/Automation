import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInPage extends TestBase{

    @Test(priority = 2)
    public void clickSignIn(){
        driver.findElement(By.className("login")).click();
        driver.findElement(By.name("email")).sendKeys("rgologan@pentalog.com");
        driver.findElement(By.id("passwd")).sendKeys("123456789");
        driver.findElement(By.id("SubmitLogin")).click();

    }
}

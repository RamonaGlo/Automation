import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
//    @Test(priority = 2)
    public void clickSignIn(){
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).click();
    }
}

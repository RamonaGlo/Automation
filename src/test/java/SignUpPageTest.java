import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {
//    @Test(priority = 3)
    public void clickCreateAnAccount(){
        driver.findElement(By.id("email_create")).sendKeys("rgologan@pentalog.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Ramona");
        driver.findElement(By.name("customer_lastname")).sendKeys("Marin");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("passwd")).sendKeys("123456789");
        Select daysdrop = new Select(driver.findElement(By.id("days")));
        daysdrop.selectByValue("20");
        Select monthdrop = new Select(driver.findElement(By.id("months")));
        monthdrop.selectByValue("10");
        Select yeardrop = new Select(driver.findElement(By.id("years")));
        yeardrop.selectByValue("1984");
        driver.findElement(By.id("newsletter")).click();
//        driver.findElement(By.name("firstname")).sendKeys("");
        driver.findElement(By.id("address1")).sendKeys("Str.Ciurchi, nr. 126-128");
        driver.findElement(By.id("city")).sendKeys("Iasi");
        Select statedrop = new Select(driver.findElement(By.id("id_state")));
        statedrop.selectByValue("10");
        driver.findElement(By.id("postcode")).sendKeys("00000");
        driver.findElement(By.name("phone_mobile")).sendKeys("0125478963");
        driver.findElement(By.id("alias")).sendKeys("");
        driver.findElement(By.id("submitAccount")).click();
    }
}


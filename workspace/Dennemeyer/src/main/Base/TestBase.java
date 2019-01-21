import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public FirefoxDriver driver;

    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver","D:\\qaa\\automation\\geckodriver-v0.21.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

    }

    @BeforeClass
    public void bmet() {
        createDriver();

    }

    @AfterClass
    public void amet() {
//		driver.quit();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeSuite
    public void suitSetUp(){
        //create new driver chrome
        System.setProperty("webdriver.chrome.driver","D:/qaa/automation/chromedriver_win32/chromedriver.exe");// ./../../resources
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}

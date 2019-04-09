import framework.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeSuite
    public void initiateDriverInstance() throws IOException {
        if (Utility.fetchPropertlyValue("browserName").toString().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:/Users/rgologan/Workspace/auto/automation/src/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (Utility.fetchPropertlyValue("browserName").toString().equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver","C:/Users/rgologan/Workspace/auto/automation/src/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (Utility.fetchPropertlyValue("browserName").toString().equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.chrome.driver","C:/Users/rgologan/Workspace/auto/automation/src/driver/iedriverserver.exe");
            driver = new InternetExplorerDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver","C:/Users/rgologan/Workspace/auto/automation/src/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get(Utility.fetchPropertlyValue("applicationURL").toString());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void closeDriverInstance(){
        driver.quit();
    }



    }



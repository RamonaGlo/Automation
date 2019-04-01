package framework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    @FindBy(className = "page-heading")
    private WebElement pageHeading;

    @FindBy(className = "logout")
    private WebElement signoutButton;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getHeadingValue(){
        return pageHeading.getText();
    }

    public void signOut(){
        try{
            if(signoutButton.isDisplayed()){
                signoutButton.click();
            }
        }
        catch (NoSuchElementException e){
            System.out.println("Logout button is not displayed");
        }


    }
}

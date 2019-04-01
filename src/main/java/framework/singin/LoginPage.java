package framework.singin;
import framework.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage    {

    @FindBy(className = "login")
    private WebElement goToLoginButton;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;


    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='center_column']/div[1]")
    private WebElement loginError;



    @FindBy (id = "authentication")
    private  WebElement authentication;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void  goTo(){
        goToLoginButton.click();
    }

    public void  login(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public Boolean isErrorDispalyed(){
        return loginError.isDisplayed();
    }
}

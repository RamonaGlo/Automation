package framework.signup;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(className = "login")
    private WebElement goToLoginButton;

    @FindBy(id = "email_create")
    private WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    private WebElement createButton;

    @FindBy(id = "id_gender2")
    private WebElement titleCheckBox;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "days")
    private WebElement daysSelect;

    @FindBy(id = "months")
    private WebElement monthsSelect;

    @FindBy(id = "years")
    private WebElement yearsSelect;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheck;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement stateSelect;

    @FindBy(id = "postcode")
    private WebElement postCodeInput;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobileInput;

    @FindBy(id = "alias")
    private WebElement emailAliasInput;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='create_account_error']")
    private WebElement createError;

    @FindBy(className = "logout")
    private WebElement signoutButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void  goTo(){goToLoginButton.click();}

    public void  signUp( String lastInput, String emaill, String password, String first, String last, String address, String city, String postCode, String mobile,String alias) {
        lastNameInput.sendKeys(lastInput);
        email.sendKeys(emaill);
        passwordInput.sendKeys(password);
        Select daySelect = new Select(daysSelect);
        daySelect.selectByValue("20");
        Select monthSelect = new Select(monthsSelect);
        monthSelect.selectByValue("10");
        Select yearSelect = new Select(yearsSelect);
        yearSelect.selectByValue("1984");
        newsletterCheck.click();
        firstName.sendKeys(first);
        lastName.sendKeys(last);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        Select state = new Select(stateSelect);
        state.selectByValue("5");
        postCodeInput.sendKeys(postCode);
        phoneMobileInput.sendKeys(mobile);
        emailAliasInput.sendKeys(alias);
        registerButton.click();
    }

    public SignUpPage checkEmail(String email){
        emailInput.sendKeys(email);
        createButton.click();
        return this;
    }

    public SignUpPage selectTitle(String title){
        if (title == "Mrs"){
            titleCheckBox.click();
        }else {
            titleCheckBox.click();
        }
        return this;
    }

    public SignUpPage addFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }




    public void signOut(){signoutButton.click();}
    public void  create (String email){
        emailInput.sendKeys(email);
        createButton.click();
    }
    public Boolean isErrorDispalyed(){
        return createError.isDisplayed();
    }
}

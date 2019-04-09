package framework.signup;

import com.mifmif.common.regex.Generex;
import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

public class SignUpPage extends BasePage {

    @FindBy(className = "login")
    private WebElement goToLoginButton;

    @FindBy(id = "email_create")
    private WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    private WebElement createButton;

    @FindBy(id = "id_gender1")
    private WebElement titleCheckBoxMr;

    @FindBy(id = "id_gender2")
    private WebElement titleCheckBoxMrs;

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

    public SignUpPage checkEmail(){

        String regex = "\\w{10}\\@gmail\\.com";
        emailInput.sendKeys(new Generex(regex).random());
        createButton.click();
        return this;
    }

    public SignUpPage selectTitle(String title){
        if (title == "Mrs"){
            titleCheckBoxMrs.click();
        }else {
            titleCheckBoxMr.click();
        }
        return this;
    }

    public SignUpPage addFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }
    public SignUpPage addLastName(String lastInput){
        lastNameInput.sendKeys(lastInput);
        return this;
    }
    public SignUpPage emailSend (String emaill){
        email.sendKeys(emaill);
        return this;
    }
    public SignUpPage passwordSend (String password){
        passwordInput.sendKeys(password);
        return this;
    }
    public SignUpPage selectDays (){
        Select daySelect = new Select(daysSelect);
        daySelect.selectByValue("20");
        return this;
    }
    public SignUpPage selectMonths ( ){
        Select monthSelect = new Select(monthsSelect);
        monthSelect.selectByValue("10");
        return this;
    }
    public SignUpPage selectYears( ){
        Select yearSelect = new Select(yearsSelect);
        yearSelect.selectByValue("1984");
        return this;
    }
    public SignUpPage newsletter (){
        newsletterCheck.click();
        return this;
    }
    public SignUpPage firstName (String first){
        firstName.sendKeys(first);
        return this;
    }
    public SignUpPage lastName (String last){
        lastName.sendKeys(last);
        return this;
    }
    public SignUpPage addAddress (String address){
        addressInput.sendKeys(address);
        return this;
    }
    public SignUpPage addCity (String city){
        cityInput.sendKeys(city);
        return this;
    }
    public SignUpPage selectState (){
        Select state = new Select(stateSelect);
        state.selectByValue("5");
        return this;
    }
    public SignUpPage addPostCode (String postCode){
        postCodeInput.sendKeys(postCode);
        return this;
    }
    public SignUpPage addMobileNumber (String mobile){
        phoneMobileInput.sendKeys(mobile);
        return this;
    }
    public SignUpPage addAliasEmail (){

        String regex = "\\w{10}\\@gmail\\.com";
        emailAliasInput.sendKeys(new Generex(regex).random());
            return this;
    }
    public SignUpPage registerButton (){
        registerButton.click();
        return this;
    }
    public SignUpPage createError (String email){
        emailInput.sendKeys(email);
        createButton.click();
        return this;
    }


    public Boolean isErrorDispalyed(){
        return createError.isDisplayed();
    }
}

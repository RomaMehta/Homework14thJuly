package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;


public class RegisterPage extends Utils {
    LoadProp loadProp = new LoadProp();

    // making object for all the required locators present in the Register Page
    // writing the locators here (ie. inside the class but outside the method) will enable us edit the locator if it has been changed - without touching the code.
    // using private because we will be using it only for this class
    private By _headerRegister = By.xpath("//*[@class='page-title']/h1");
    private By _genderField = By.id("gender-female");
    private By _firstNameField = By.id("FirstName");
    private By _lastNameField = By.id("LastName");
    private By _dateOfBirthDayField = By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthMonthField = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _yearOfBirthField = By.xpath("//select[@name='DateOfBirthYear']");
    private By _emailField = By.id("Email");
    private By _companyNameField = By.id("Company");
    private By _newsLetterField = By.id("Newsletter");
    private By _passWordField = By.id("Password");
    private By _confirmPasswordField = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");


    public void toVerifyUserIsOnRegistrationPage () {
        Assert.assertTrue(getText(_headerRegister).contains("Register"));
    }
    public void toRegisterUser (){
        clickOnElement(_genderField);
        enterText(_firstNameField ,loadProp.getProperty("firstname"));
        System.out.println(loadProp.getProperty("firstname"));
        enterText(_lastNameField , loadProp.getProperty("lastname"));
        selectByVisibleText(_dateOfBirthDayField , loadProp.getProperty("birthdate"));
        selectByVisibleText(_birthMonthField , loadProp.getProperty("birthmonth"));
        selectByVisibleText(_yearOfBirthField , loadProp.getProperty("birthyear"));
        enterText(_emailField , loadProp.getProperty("email") + timeStamp() + "@gmail.com");
        enterText(_companyNameField , loadProp.getProperty("companyname"));
        clickOnElement(_newsLetterField);
        enterText(_passWordField , loadProp.getProperty("password"));
        enterText(_confirmPasswordField , loadProp.getProperty("confirmpassword"));
        clickOnElement(_registerButton);

    }
}

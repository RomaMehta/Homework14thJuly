package nopCom;

import org.openqa.selenium.By;

public class ShippingAddressPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _countryField = By.id("BillingNewAddress_CountryId");
    private By _stateField = By.id("BillingNewAddress_StateProvinceId");
    private By _cityField = By.id("BillingNewAddress_City");
    private By _address1Field = By.id("BillingNewAddress_Address1");
    private By _address2Field = By.id("BillingNewAddress_Address2");
    private By _zipcodeField = By.id("BillingNewAddress_ZipPostalCode");
    private By _phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    private By _faxNumberField = By.id("BillingNewAddress_FaxNumber");
    private By _continueShippingAddressButton = By.xpath("//*[@id='billing-buttons-container']/input[1]");
    private By _firstName = By.id("BillingNewAddress_FirstName");
    private By _lastName = By.id("BillingNewAddress_LastName");
    private By _emailAdd = By.id("BillingNewAddress_Email");
    private By _companyName = By.id("BillingNewAddress_Company");



    public void fillShippingAddressDetails(){
        selectByVisibleText(_countryField , loadProp.getProperty("Country"));
        waitForElementToLoad(_stateField , 10);
        selectByVisibleText(_stateField , loadProp.getProperty("State"));
        enterText(_cityField , loadProp.getProperty("City"));
        enterText(_address1Field , loadProp.getProperty("Address1"));
        enterText(_address2Field , loadProp.getProperty("Address2"));
        enterText(_zipcodeField , loadProp.getProperty("PostalCode"));
        enterText(_phoneNumberField , loadProp.getProperty("Phonenumber"));
        enterText(_faxNumberField, loadProp.getProperty("Faxnumber"));
        clickOnElement(_continueShippingAddressButton);
    }
    public void fillDetailsForGuestUser(){
        enterText(_firstName , loadProp.getProperty("firstname"));
        enterText(_lastName,loadProp.getProperty("lastname"));
        enterText(_emailAdd,loadProp.getProperty("email") + timeStamp() + "@gmail.com");
        enterText(_companyName,loadProp.getProperty("companyname"));
    }

}

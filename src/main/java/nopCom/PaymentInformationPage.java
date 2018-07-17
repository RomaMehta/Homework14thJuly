package nopCom;

import org.openqa.selenium.By;

public class PaymentInformationPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _creditCardType = By.id("CreditCardType");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _expiryMonth = By.id("ExpireMonth");
    private By _expiryYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");
    private By _paymentInfoContinueButton = By.xpath("//*[@id='payment-info-buttons-container']/input[1]");

    public void enterCardDetails(){
        selectByVisibleText(_creditCardType , loadProp.getProperty("CreditcardType"));
        enterText(_cardHolderName , loadProp.getProperty("CardHolderName"));
        enterText(_cardNumber , loadProp.getProperty("CreditCardno"));
        selectByVisibleText(_expiryMonth , loadProp.getProperty("ExpiryMonth"));
        selectByVisibleText(_expiryYear , loadProp.getProperty("ExpiryYear"));
        enterText(_cardCode , loadProp.getProperty("cardCode"));
        waitForElementToBeClickable(_paymentInfoContinueButton , 10);
        clickOnElement(_paymentInfoContinueButton);
    }
}

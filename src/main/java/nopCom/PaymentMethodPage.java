package nopCom;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils {
    private By _creditCardButton = By.id("paymentmethod_1");
    private By _paymentContinueButton = By.xpath("//*[@id='payment-method-buttons-container']/input[1]");

    public void selectPaymentOption(){
        clickOnElement(_creditCardButton);
        clickOnElement(_paymentContinueButton);
    }
}

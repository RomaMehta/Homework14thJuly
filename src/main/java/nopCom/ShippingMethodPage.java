package nopCom;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils {
    private By _nextDayAirShippingButton = By.id("shippingoption_1");
    private By _shippingContinueButton = By.xpath("//*[@id='shipping-method-buttons-container']/input[1]");

    public void selectShippingOption(){
        clickOnElement(_nextDayAirShippingButton);
        clickOnElement(_shippingContinueButton);
    }
}

package nopCom;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utils {
    private By _confirmButton = By.xpath("//*[@id='confirm-order-buttons-container']/input");

    public void clickOnConfirm(){
        waitForElementToBeClickable(_confirmButton,10);
        clickOnElement(_confirmButton);
    }
}

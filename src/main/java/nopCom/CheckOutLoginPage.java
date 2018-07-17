package nopCom;

import org.openqa.selenium.By;

public class CheckOutLoginPage extends Utils {
    private By _checkOutRegisterButton = By.xpath("//*[@class='customer-blocks']/div/div[3]/input[2]");
    private By _checkOutAsGuestButton = By.xpath("//*[@class='page-body']/div/div/div[3]/input[1]");

    public void toClickOnCheckOutRegisterButton(){

        clickOnElement(_checkOutRegisterButton);
    }
    public void checkOutAsGuest(){
        clickOnElement(_checkOutAsGuestButton);
    }

}

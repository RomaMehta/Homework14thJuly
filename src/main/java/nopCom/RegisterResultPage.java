package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _registerResult = By.className("result");
    //String expectedRegistrationSuccessMessage = "Your registration completed";
    private By _continueButton = By.xpath("//*[@class='page-body']/div[2]/input");

    public void toVerifyRegistrationResult(){
        waitForElementToBeVisible(_registerResult,10);
        Assert.assertEquals(getText(_registerResult),loadProp.getProperty("expectedRegistrationSuccessMessage"));
        clickOnElement(_continueButton);


    }
}

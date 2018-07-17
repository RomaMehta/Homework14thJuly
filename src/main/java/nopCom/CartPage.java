package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _flowerGirlBraceletQuantityField = By.xpath("//*[@class='quantity']/input[1]");
    private By _updateCartButton = By.name("updatecart");
    private By _checkoutButton = By.id("checkout");
    //String expectedTermsOfServiceMessage = "Please accept the terms of service before the next step.";
    private By _termsOfServiceWarningBox = By.id("terms-of-service-warning-box");
    private By _closeTermsOfServiceWindow = By.xpath("//div[7]/div[1]/button");
    private By _termsOfServiceTickBox = By.id("termsofservice");
    private By _AppleiCamProductName = By.xpath("//*[@class='product']/a");

    public void toUpdateQuantityAndVerifyTermsOfService(){
        clearAndEnterText(_flowerGirlBraceletQuantityField , loadProp.getProperty("flowerGirlBraceletQuantity"));
        clickOnElement(_updateCartButton);
        clickOnElement(_checkoutButton);
        Assert.assertTrue(getText(_termsOfServiceWarningBox).contains(loadProp.getProperty("expectedTermsOfServiceMessage")));
        clickOnElement(_closeTermsOfServiceWindow);
        clickOnElement(_termsOfServiceTickBox);
        clickOnElement(_checkoutButton);
    }
    public void toClickOnTermsOfServiceAndCheckout(){
        clickOnElement(_termsOfServiceTickBox);
        clickOnElement(_checkoutButton);
    }

    public void verifyAppleiCamIsAddedToCart(){
        Assert.assertTrue(getText(_AppleiCamProductName).contains(loadProp.getProperty("ExpectedProductName")));
        System.out.println(getText(_AppleiCamProductName));

    }
}

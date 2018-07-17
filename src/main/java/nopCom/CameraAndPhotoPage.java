package nopCom;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils {
    private By _AppleiCamAddToCartButton = By.xpath("//*[@data-productid='17']/div[2]/div[3]/div[2]/input[1]");
    private By _shoppingCartFlashBar = By.linkText("shopping cart");

    public void addtoCartAppleiCam(){
        clickOnElement(_AppleiCamAddToCartButton);
        waitForElementToBeVisible(_shoppingCartFlashBar , 10);
        clickOnElement(_shoppingCartFlashBar);
    }
}

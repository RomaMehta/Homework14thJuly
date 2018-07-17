package nopCom;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {
    private By _cameraAndPhotoLink = By.xpath("//*[@class = 'sub-category-item']/h2/a");

    public void clickOnCameraAndPhoto(){
        clickOnElement(_cameraAndPhotoLink);
    }
}

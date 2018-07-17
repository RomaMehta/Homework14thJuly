package nopCom;

import org.openqa.selenium.By;

public class JeweleryPage extends Utils {
    private By _addToCartFlowerGirlBracelet = By.xpath("//*[@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    private By _greenFlashBar = By.linkText("shopping cart");
    private By _addToCartVintageEngagementRing = By.xpath("//*[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[1]");

    public void addingJeweleryToCart(){
        clickOnElement(_addToCartFlowerGirlBracelet);
        waitForElementToBeInvisible(_greenFlashBar,10);
        clickOnElement(_addToCartVintageEngagementRing);
        waitForElementToBeVisible(_greenFlashBar,10);
        clickOnElement(_greenFlashBar);
    }
}

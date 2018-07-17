package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();

    String expectedProductCurrencyValue = "€1140.00";

    private By _registerLink = By.linkText("Register");
    private By _logOutLink = By.linkText("Log out");
    private By _jeweleryLink = By.linkText("Jewelry");
    private By _currency = By.id("customerCurrency");
    private By _productcurrencyChange = By.xpath("//*[@class='add-info']/div/span");
    private By _virtualGiftCardLink = By.linkText("$25 Virtual Gift Card");
    private By _buildYourOwnComputerAddToCompareButton = By.xpath("//*[@title='Add to compare list']");
    private By _virtualGiftCardAddToCompareButton = By.xpath("//*[@class = 'product-grid home-page-product-grid']/div[2]/div[4]/div/div[2]/div[3]/div[2]/input[2]");
    private By _productComparisonGreenFlashBar = By.linkText("product comparison");
    private By _electronicsLink = By.linkText("Electronics");
    private By _booksLink = By.linkText("Books");



    public void clickOnRegister(){
        clickOnElement(_registerLink);
    }

    public void verifyUserIsLoggedIn (){

        Assert.assertTrue(getText(_logOutLink).contains("Log out"));
    }

    public void clickOnJeweleryLink (){

        clickOnElement(_jeweleryLink);
    }

    public void changeCurrency(){
        selectByVisibleText(_currency , loadProp.getProperty("Currency") );
        waitForElementToBeVisible(_productcurrencyChange , 10);
        Assert.assertEquals(getText(_productcurrencyChange) ,expectedProductCurrencyValue);
        System.out.println(getText(_productcurrencyChange));
    }

    public void clickOnVirtualGiftCard (){

        clickOnElement(_virtualGiftCardLink);
    }

    public void addTwoProductsToCompareList(){
        clickOnElement(_buildYourOwnComputerAddToCompareButton);
        waitForElementToBeInvisible(_productComparisonGreenFlashBar , 10);
        clickOnElement(_virtualGiftCardAddToCompareButton);
        waitForElementToBeVisible(_productComparisonGreenFlashBar,10);
        clickOnElement(_productComparisonGreenFlashBar);
    }

    public void clickOnElectronicLink(){

        clickOnElement(_electronicsLink);
    }

    public void clickOnBooksLink(){
        clickOnElement(_booksLink);
    }

}

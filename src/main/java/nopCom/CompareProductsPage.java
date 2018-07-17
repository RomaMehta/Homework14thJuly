package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductsPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _compareProductsHeader = By.xpath("//*[@class='page-title']/h1");
    private By _clearCompareProductListButton = By.className("clear-list");
    private By _clearCompareProductListMessageField = By.className("no-data");


    public void verifyUserIsOnCompareProductsPage(){
        Assert.assertEquals(getText(_compareProductsHeader),loadProp.getProperty("expectedCompareProductHeading"));

    }

    public void toClearCompareProductListAndVerify(){
        clickOnElement(_clearCompareProductListButton);
        Assert.assertEquals(getText(_clearCompareProductListMessageField) , loadProp.getProperty("ExpectedClearCompareProductListMessage"));



    }
}

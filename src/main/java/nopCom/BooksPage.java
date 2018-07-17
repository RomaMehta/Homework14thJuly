package nopCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BooksPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _sortByDropDown = By.id("products-orderby");
    private By _displayByDropDown = By.id("products-pagesize");
    private By _lowestPriceProduct = By.xpath("//*[@class='prices']/span[2]");
    private By _highestPriceProduct = By.xpath("//div[3]/div/div[2]/div[3]/div[1]/span[2]");
    private By _itemBoxexField = By.className("item-box");
    private By _addtoCartField = By.xpath("//input[@value='Add to cart']");
    private By _productNameField = By.className("product-title");


    public void toUseSortByAndDisplayDropDownAndVerify() {
        selectByVisibleText(_sortByDropDown, loadProp.getProperty("SortBy"));
        //waitForElementToBeVisible(_displayByDropDown,10);
        selectByIndex(_displayByDropDown ,0);
        // selectByVisibleText(_displayByDropDown, loadProp.getProperty("DisplayBy"));
        String lowestPrice = getText(_lowestPriceProduct);
        String highestPrice = getText(_highestPriceProduct);
        double lowestPriceNum = Double.parseDouble(lowestPrice.replace("$", ""));
        double highestPriceNum = Double.parseDouble(highestPrice.replace("$", ""));
        Assert.assertTrue(lowestPriceNum < highestPriceNum);
        System.out.println(lowestPrice + " < " + highestPrice);
        List<WebElement> webElementList = driver.findElements(_itemBoxexField);
        int count = 0, nobutton = 0;
        for (WebElement element : webElementList) {
            if (element.findElements(_addtoCartField).size()==1){
                count++;
            }
            if (element.findElements(_addtoCartField).size()!=1){
                nobutton++;
                System.out.println(getText(_productNameField) + " Add To Cart Button Absent ");
            }
        }
        System.out.println(count);
        Assert.assertNotEquals(webElementList.size(),count);
        // why does this keeps going to the first product??
    }
}

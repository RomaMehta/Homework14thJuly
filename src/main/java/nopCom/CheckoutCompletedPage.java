package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class CheckoutCompletedPage extends Utils {
    LoadProp loadProp = new LoadProp();

 private By _orderSuccessMessage = By.xpath("//*[@class='master-wrapper-content']/div/div/div/div[2]/div/div/strong");
 private By _ordersuccessContinueButton = By.xpath("//*[@class='master-wrapper-content']/div/div/div/div[2]/div/div[3]/input");

 public void checkOrderSuccessful(){

     Assert.assertTrue(getText(_orderSuccessMessage).contains(loadProp.getProperty("expectedOrderSuccessMessage")));
     String URL = driver.getCurrentUrl();
     assertEquals(URL, "http://demo.nopcommerce.com/checkout/completed/" );
     System.out.println(URL);
     clickOnElement(_ordersuccessContinueButton);
 }
}

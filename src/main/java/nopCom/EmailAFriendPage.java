package nopCom;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _friendEmail = By.id("FriendEmail");
    private By _sendersEmail = By.id("YourEmailAddress");
    private By _personalMessage = By.id("PersonalMessage");
    private By _sendEmailButton = By.xpath("//*[@method='post']/div[2]/input[1]");
    private By _expectedRejectMessage = By.xpath("//*[@method='post']/div/ul/li");

    public void fillFriendsDetailsAndVerifyResult(){
        enterText(_friendEmail , loadProp.getProperty("RecipientsEmail"));
        enterText(_sendersEmail , loadProp.getProperty("SendersEmail"));
        enterText(_personalMessage , loadProp.getProperty("Message"));
        clickOnElement(_sendEmailButton);
        Assert.assertEquals(getText(_expectedRejectMessage ) , loadProp.getProperty("ExpectedRejectMessage"));
    }
}

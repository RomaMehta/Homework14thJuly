package nopCom;

import org.openqa.selenium.By;

public class VirtualGiftCardPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _recipientName = By.id("giftcard_43_RecipientName");
    private By _recipientEmail = By.id("giftcard_43_RecipientEmail");
    private By _senderName = By.id("giftcard_43_SenderName");
    private By _senderEmail = By.id("giftcard_43_SenderEmail");
    private By _giftMessage = By.id("giftcard_43_Message");
    private By _emailAFriendButton = By.xpath("//*[@id='product-details-form']/div/div[1]/div[2]/div[8]/div[3]/input");

    public void fillVirtualGiftCardDetails(){
        enterText(_recipientName , loadProp.getProperty("RecipientsName"));
        enterText(_recipientEmail , loadProp.getProperty("RecipientsEmail"));
        enterText(_senderName , loadProp.getProperty("SendersName"));
        enterText(_senderEmail , loadProp.getProperty("SendersEmail"));
        enterText(_giftMessage , loadProp.getProperty("Message"));
        clickOnElement(_emailAFriendButton);
    }

}

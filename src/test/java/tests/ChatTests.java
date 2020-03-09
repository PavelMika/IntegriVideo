package tests;

import org.testng.annotations.Test;

public class ChatTests extends BaseTest {

    @Test
    public void sendMessage() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickSend();
        chatPage.messageShouldExist(1,"Test");
    }

    @Test
    public void sendMessageByButton(){
        chatPage.openPage();
        chatPage.writeText("Test2");
        chatPage.clickByButton();
        chatPage.messageShouldExist(1,"Test2");
    }

   /* @Test
    public void sendThousandSimbols(){
        chatPage.openPage();
        chatPage.writeText("Test2");
        chatPage.clickByButton();
        chatPage.messageShouldExist(1,"Test2");

    }*/

}

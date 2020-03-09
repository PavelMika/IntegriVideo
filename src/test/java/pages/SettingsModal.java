package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class SettingsModal extends BasePage {
    SettingsModal(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get("https://dev.integrivideo.com/demo/chat/new");
    }

    public void writeText(String text){
        driver.findElement(By.cssSelector("textarea")).sendKeys(text);
    }

    public void clickByButton(){
        driver.findElement(By.cssSelector(".iv-icon.iv-icon-paper-plane")).click();
    }

    public void messageShouldExist(int messageIndex, String text){
        List<WebElement> messages = driver.findElements(By.cssSelector(".integri-chat-message-text"));
        boolean isExist = messages.get(messageIndex -1).getText().equals(text);
        assertTrue("Message does not exist", isExist);
    }
}

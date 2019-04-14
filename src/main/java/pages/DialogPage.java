package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import text.Messages;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DialogPage {

    private WebDriver driver;

    private By buddyListFrame = By.cssSelector("iframe[id*=\"wblh0\"]");
    private By newChatButton = By.cssSelector("button[title=\"Новый чат\"]");
    private By chooseInteriorFrame = By.cssSelector("iframe[id$=\"-1\"]");
    private By chooseTwoBot = By.cssSelector("div[class=\"Jv\"]");
    private By dialogFrame = By.cssSelector("iframe.a7A");
    private By dialogTextbox = By.cssSelector("div[role=\"textbox\"]");

    public DialogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newChat() {
        driver.switchTo().frame(driver.findElement(buddyListFrame));
        driver.findElement(newChatButton).click();
        driver.switchTo().defaultContent();
    }

    public void startDialog(String botTwoName) {
        driver.switchTo().frame(driver.findElement(chooseInteriorFrame));
        driver.findElement(chooseTwoBot).click();
        driver.switchTo().defaultContent();
        driver.findElement(dialogFrame);
        List<WebElement> elements = driver.findElements(dialogFrame);
        if (elements.size() > 1) {
            driver.switchTo().frame(elements.get(1));
        } else driver.switchTo().frame(elements.get(0));
        WebElement element = driver.findElement(dialogTextbox);


//        element.sendKeys("привет");
//        element.sendKeys(Keys.ENTER);
        for (String message : Messages.abc) {
            List<WebElement> names = driver.findElements(
                    By.xpath("(//span[text() = \"" + botTwoName + "\"])")
            );
            driver.findElement(
                    By.xpath("(//span[text() = \"" + botTwoName + "\"])[" + (names.size() + 1) + "]")
            );
            element.sendKeys(message);
            element.sendKeys(Keys.ENTER);
        }
    }
}

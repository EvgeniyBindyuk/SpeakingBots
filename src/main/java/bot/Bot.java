package bot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import settings.WebDriverSettings;
import text.Messages;
import java.util.List;

public class Bot extends WebDriverSettings implements IBot{

    private String email;
    private String password;
    private String botTwoName;

    public Bot(String email, String password, String botTwoName) {
        this.email = email;
        this.password = password;
        this.botTwoName = botTwoName;
    }

    public void openGmail() {
        driver.navigate().to("https://www.google.com/gmail/");
    }

    public void logIn() {
        //email
        driver.findElement(By.cssSelector("div#view_container div.Xb9hP input")).sendKeys(email);
        driver.findElement(By.cssSelector("#identifierNext span")).click();
        //password
        driver.findElement(By.cssSelector("div.Xb9hP input[type=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("div[id=\"passwordNext\"]")).click();
    }

    public void talk() {
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id*=\"wblh0\"]")));
        driver.findElement(By.cssSelector("button[title=\"Новый чат\"]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id$=\"-1\"]")));
        driver.findElement(By.cssSelector("div[class=\"Jv\"]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("iframe.a7A"));
        List<WebElement> elements = driver.findElements(By.cssSelector("iframe.a7A"));
        if (elements.size() > 1) {
            driver.switchTo().frame(elements.get(1));
        } else driver.switchTo().frame(elements.get(0));
        WebElement element = driver.findElement(By.cssSelector("div[role=\"textbox\"]"));
        element.sendKeys("привет");
        element.sendKeys(Keys.ENTER);
        for (String message : Messages.messagesList) {
            List<WebElement> names = driver.findElements(By.xpath("(//span[text() = \"" + botTwoName + "\"])"));
            driver.findElement(By.xpath("(//span[text() = \"" + botTwoName + "\"])[" + (names.size() + 1) + "]"));
            element.sendKeys(message);
            element.sendKeys(Keys.ENTER);
        }
    }
}

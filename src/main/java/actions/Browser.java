package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import settings.WebDriverSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser extends WebDriverSettings {

    private ChromeDriver driver;

    {
        driver = new ChromeDriver();
    }

    public void openMail() {
        driver.navigate().to("https://www.google.com/gmail/");
    }

    public void fillForm(String email, String password) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //email
        driver.findElement(By.cssSelector("div#view_container div.Xb9hP input")).sendKeys(email);
        driver.findElement(By.cssSelector("#identifierNext span")).click();
        //password
        driver.findElement(By.cssSelector("div.Xb9hP input[type=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("div[id=\"passwordNext\"]")).click();
    }

    public void startDialog(ArrayList<String> messages) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
        for (String message : messages) {
            element.sendKeys(message);
            element.sendKeys(Keys.ENTER);
        }
    }
}


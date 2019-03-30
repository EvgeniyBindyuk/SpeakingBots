package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import settings.WebDriverSettings;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser extends WebDriverSettings {

    public void openMail() {
        driver.navigate().to("https://www.google.com/gmail/");
    }

    public void fillForm(String email, String password) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //email
        driver.findElement(By.cssSelector("div#view_container div.Xb9hP input")).sendKeys(email);
        driver.findElement(By.cssSelector("#identifierNext span")).click();
        //password
        driver.findElement(By.cssSelector("div.Xb9hP input[type=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("div[id=\"passwordNext\"] content span")).click();
    }

    public void firstMessage(String email) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("div[class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();

        for (String childHandle : driver.getWindowHandles()) {
            if (!childHandle.equals(parentHandle)) {
                driver.switchTo().window(childHandle);
            }
        }
        driver.findElement(By.cssSelector("div[class=\"wO nr l1\"] textarea")).click();
        driver.findElement(By.cssSelector("div[class=\"wO nr l1\"] textarea")).sendKeys(email);
        driver.findElement(By.cssSelector("div[class=\"wO nr l1\"] textarea")).submit();
        driver.findElement(By.cssSelector("div[role=\"textbox\"]")).click();
        driver.findElement(By.cssSelector("div[role=\"textbox\"]")).sendKeys("Привет женя, я тупой бот");
        driver.findElement(By.cssSelector("td[class=\"gU Up\"] div[role=\"button\"]")).click();

        driver.switchTo().window(parentHandle);
    }

    public void startDialog(int countMessages) {
        for (int i = 0; i < countMessages; i++) {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div[@class=\"aim ain\"]//div[@class=\"bsU\" and contains(text(), \"1\")]"));
            List<WebElement> elements = driver.findElements(By.cssSelector("tr[tabindex=\"-1\"]"));
            elements.get(0).click();
            driver.findElement(By.cssSelector("table[role=\"presentation\"] span[id=\":9b\"]")).click();
            driver.findElement(By.cssSelector("div[aria-label=\"Тело письма\"]")).sendKeys("gbc.y");
            driver.findElement(By.cssSelector("div[id=\":sb\"]")).click();
        }
    }
}


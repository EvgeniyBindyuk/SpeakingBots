package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import settings.WebDriverSettings;

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
        driver.findElement(By.cssSelector("div#passwordNext")).click();
    }

    public void startDialog(String email) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div[class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
        driver.findElement(By.cssSelector("div[class=\"wO nr l1\"] textarea")).sendKeys(email);
        WebElement element = driver.findElement(By.cssSelector("div[id=\":9g\"]"));
        element.click();
        element.sendKeys("Привет женя, я тупой бот");
        driver.findElement(By.cssSelector("div[id=\":81\"]")).click();
    }

}

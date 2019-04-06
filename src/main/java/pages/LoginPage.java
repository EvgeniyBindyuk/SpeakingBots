package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailForm = By.cssSelector("div#view_container div.Xb9hP input");
    private By passwordForm = By.cssSelector("div.Xb9hP input[type=\"password\"]");
    private By emailSubmitBtn = By.cssSelector("#identifierNext span");
    private By passwordSubmitBtn = By.cssSelector("div[id=\"passwordNext\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeEmail(String email) {
        driver.findElement(emailForm).sendKeys(email);
        driver.findElement(emailSubmitBtn).click();
    }

    public void typePassword(String password) {
        driver.findElement(passwordForm).sendKeys(password);
        driver.findElement(passwordSubmitBtn).click();
    }
}

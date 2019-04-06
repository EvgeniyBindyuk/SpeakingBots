package settings;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    protected ChromeDriver driver;

    {
        System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverSettings {

    ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

//    @AfterMethod
//    public void close() {
//        driver.quit();
//        System.out.println("test end");
//    }
}

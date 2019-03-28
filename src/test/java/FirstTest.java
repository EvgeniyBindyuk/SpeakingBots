import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    //    @Test
//    public void firstTest() {
//        driver.get("https://www.delivery-club.ru/");
//    }
//
//    @Test
//    public void secondTest() {
//        driver.get("https://www.delivery-club.ru/");
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "«Delivery Club» — круглосуточная доставка из любимых ресторанов города");
//    }
//
//    @Test
//    public void isElementPresent() {
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        driver.get("https://www.delivery-club.ru/");
//        List<WebElement> list = driver.findElements(By.tagName("div"));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        if (list.size() == 0) {
//            System.out.println("false");
//        } else System.out.println(list.get(0));
//    }


    @Test
    public void testOne() {
        driver.get("https://yandex.ru");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Яндекс");
    }
}



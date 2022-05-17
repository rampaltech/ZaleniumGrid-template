package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {


//    RemoteWebDriver driver;
    WebDriver driver;

    @BeforeTest
    void setup() throws MalformedURLException {
//        DesiredCapabilities dc=new DesiredCapabilities();
//        dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
//
//        URL url = new URL("http://localhost:4444/wd/hub");
//        driver = new RemoteWebDriver(url, dc);
//        =================================================================
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/login?");
    }

    @Test
    void loginTest(){
        driver.findElement(By.xpath("//*[@id='Username']")).sendKeys("its..me");
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("its..not me");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}

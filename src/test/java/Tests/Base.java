package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
    WebDriver webdriver;

    @BeforeMethod
    public void setupMethods() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
        Thread.sleep(3000);
        webdriver.manage().window().maximize();
        webdriver.get("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public void tearDown(){
        webdriver.quit();
    }
}

package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends Base {

    @Test
    public void firstTest() {

        WebElement registerLink = webdriver.findElement(By.className("ico-register"));
        registerLink.click();
        WebElement genderFiled = webdriver.findElement(By.id("gender-male"));
        genderFiled.click();
        WebElement fNameFiled = webdriver.findElement(By.id("FirstName"));
        fNameFiled.sendKeys("Pera");
        WebElement lNameFiled = webdriver.findElement(By.id("LastName"));
        lNameFiled.sendKeys("Peric");
        WebElement emailFiled = webdriver.findElement(By.id("Email"));
        emailFiled.sendKeys("pera@gmiil.com");
        WebElement passwordFiled = webdriver.findElement(By.id("Password"));
        passwordFiled.sendKeys("123456");
        WebElement confirmPasswordFiled = webdriver.findElement(By.id("ConfirmPassword"));
        confirmPasswordFiled.sendKeys("123456");
        WebElement registerBtn = webdriver.findElement(By.id("register-button"));
        registerBtn.click();
        WebElement registeredUser = webdriver.findElement(By.cssSelector("div[class='result']"));
        String registeredUserText = registeredUser.getText();
        String expectedUserText = "Your registration completed";
        Assert.assertEquals(registeredUserText, expectedUserText);//hard assert

    }
}

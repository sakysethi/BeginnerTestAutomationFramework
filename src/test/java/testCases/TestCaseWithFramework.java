package testCases;

import base.baseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithFramework extends baseClass {

    @Test
    public void login() throws InterruptedException {

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("login_id")).sendKeys("sakshsethi@deloitte.com");
        driver.findElement(By.id("nextbtn")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("zoho@1122");
        driver.findElement(By.id("nextbtn")).click();

    }
}

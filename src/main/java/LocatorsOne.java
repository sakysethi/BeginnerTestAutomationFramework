package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOne {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));

        driver.findElement(By.id("email")).sendKeys("testtest@test.com");
        driver.findElement(By.id("pass")).sendKeys("TestCompany");
        driver.findElement(By.name("login")).click();

        driver.quit();
    }
}
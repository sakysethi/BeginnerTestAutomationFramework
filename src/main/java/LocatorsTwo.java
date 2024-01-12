package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsTwo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Barbie Doll", Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlToBe(
                "https://www.amazon.com/s?k=baribie+doll&crid=3NI811XXKR24S&sprefix=baribie+doll%2Caps%2C357&ref=nb_sb_noss_2"));

        driver.findElement(By.partialLinkText("Happy Birthday")).click();
        Thread.sleep(5);

        String productName = driver.findElement(By.id("productTitle")).getText();

        System.out.println(productName);
        // driver.findElement(By.className("nav-input")).click();
        // Thread.sleep(2000);
    }
}

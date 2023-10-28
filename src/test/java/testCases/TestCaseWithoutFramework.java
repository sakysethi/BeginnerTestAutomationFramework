package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithoutFramework {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.zoho.com");
driver.manage().window().maximize();

driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("login_id")).sendKeys("sakshsethi@deloitte.com");
driver.findElement(By.id("nextbtn")).click();

Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("zoho@1122");
driver.findElement(By.id("nextbtn")).click();

        System.out.println("Login Successfull");

        driver.quit();

    }
}

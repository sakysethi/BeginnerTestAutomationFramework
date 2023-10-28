package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseClass {

    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.zoho.com");
        driver.manage().window().maximize();

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Login Successful");
    }

}

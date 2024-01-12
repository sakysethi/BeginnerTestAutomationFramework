import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("Browser launched using WebDriver Manager");
        System.out.println("Page Title is " + driver.getTitle());
        System.out.println("Page URL is  =" driver.getCurrentUrl());

        driver.quit();
        // driver.close();
    }

}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDDowns {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement sDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dDown = new Select(sDropdown);

        dDown.selectByIndex(1);
        System.out.println(dDown.getFirstSelectedOption().getText());
        dDown.selectByValue("AED");
        System.out.println(dDown.getFirstSelectedOption().getText());
        dDown.selectByVisibleText("USD");
        System.out.println(dDown.getFirstSelectedOption().getText());

        // passengers Dropdown

        // validate the passengers getting displayed
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // Inspect the dropdown and click on it
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);

        // inspect the plus button to increment the adults using loop and click on it
        int i = 1;
        while (i < 4) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        // click on done button
        driver.findElement(By.id("btnclosepaxoption")).click();

        // validate the output we are getting
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.quit();
    }
}

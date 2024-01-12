package org.framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver){

        super(driver);
        //initialization driver
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    // =  driver.findElement(By.id("userEmail"));

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userPassword")
    WebElement userPassword;

    @FindBy(id="login")
    WebElement login;

    public void loginProcess(String email, String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        login.click();
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}

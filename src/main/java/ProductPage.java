package org.framework.pageObjects;

import org.framework.abstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends AbstractComponents {

    WebDriver driver;
    public ProductPage(WebDriver driver){

        super(driver);
        //initialization driver
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css= ".mb-3")
    List<WebElement> products;
    By productsBy = By.cssSelector(".mb-3");
    By toastMessage = By.cssSelector("#toast-container");

    @FindBy(css=".ng-animating")
    WebElement spinner;
    public List<WebElement> getAllProductsList(){

        waitForElementToAppear(productsBy);
        return products;
    }

    public WebElement getProductByName(String productName){
        WebElement prod = getAllProductsList().stream().filter(product ->
                product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        return prod;
    }

    public void addProductToCart(String productName){
        WebElement prod = getProductByName(productName);
        prod.findElement(addProductToCart()).click();
        waitForElementToAppear(toastMessage);
        waitForElementToDisappear(spinner);
    }
}

package AmazonPages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailedPage {
    WebDriver driver;

    public ProductDetailedPage() {
        this.driver = A_Hooks.driver;
    }
    public boolean itemIsAvailable(){
        String str;
        str=driver.findElement(By.id("availability")).getText();
        if(str.contains("In Stock.") )
          return true;
        else
            return false;
    }
    public WebElement addToCartBtn(){
        return driver.findElement(By.id("add-to-cart-button"));
    }
    public WebElement cartMessage(){
        return driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"));
    }
}

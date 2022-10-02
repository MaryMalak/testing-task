package AmazonPages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = A_Hooks.driver;
    }
    public WebElement SearchTextLine(){
        return driver.findElement(By.id("twotabsearchtextbox"));
    }
    public WebElement SearchBtn(){
        return driver.findElement(By.id("nav-search-submit-button"));
    }
    public WebElement Cart(){
        return driver.findElement(By.id("nav-cart"));
    }
    public WebElement donnotChangeCurrencyBtn(){
        return driver.findElement(By.cssSelector("span[class=\"a-button-inner\"]>input[data-action-type=\"DISMISS\"]"));

    }
    public WebElement TodayDealsBtn(){
        return driver.findElement(By.cssSelector("a[href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));
      // return driver.findElement(By.linkText("Today's Deals"));
        //return driver.findElement(By.cssSelector("data-csa-c-slot-id=\"nav_cs_0\""));
    }




}

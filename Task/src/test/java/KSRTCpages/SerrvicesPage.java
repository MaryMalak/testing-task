package KSRTCpages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerrvicesPage {
    WebDriver driver;

    public SerrvicesPage() {
        this.driver = A_Hooks.driver;
    }


    public WebElement boardingPoint(){
        return driver.findElement(By.id("Forward-1467550949362"));
    }
    public  WebElement firstOptionInDroppingPoint(){
        return driver.findElement(By.id("Forward-1467467616730"));
    }
    public  WebElement CDphoneLineTxt(){
        return driver.findElement(By.id("mobileNo"));
    }
    public WebElement CDemailLineTxt(){
        return driver.findElement(By.id("email"));
    }
    public WebElement Seat(String row, String column){
        return driver.findElement(By.xpath("//*[@id=\"seatlayout-Forward1\"]/ul["+column+"]/li["+row+"]"));
    }
}

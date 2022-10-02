package KSRTCpages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = A_Hooks.driver;
    }
    public void ClickSearchForBusBtn(){
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", searchButton);
    }
    public WebElement DateOfArrivalTxtLine(){
        return driver.findElement(By.id("txtJourneyDate"));
    }
    public void SetDateOfArrivalTxtLine( String day){
  
        List<WebElement> Days= driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
        for (int i=0;i<Days.size();i++){
            if(Days.get(i).getText().contains(day)) {
                Days.get(i).click();
                break;
            }
        }
    }
    public boolean secCarouselIsActive(){
        String ClassName=driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]")).getAttribute("class") ;

        if(ClassName.contains("active"))
            return true;
        else
            return false;
    }
    public WebElement fromCHIKKAMAGALURUtoBENGALURU(){
        return driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]"));
    }
    public WebElement selectSeat(int seat){
        int seatindex=seat*2;
        String s=String.valueOf(seatindex)  ;
        return driver.findElement(By.xpath("//*[@id=\"ForwardResults\"]/div["+seatindex+"]/div[1]/div[1]/div[5]/div/input[@type=\"button\"]"));
    }

}

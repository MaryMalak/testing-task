package AmazonPages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TodayDealsPage {
    WebDriver driver;

    public TodayDealsPage() {
        this.driver = A_Hooks.driver;
    }
    public int indexOfSpacificFilter(String filter){
        List<WebElement> options= driver.findElements(By.cssSelector("span[aria-label=\"Departments filter\"]>ul[class=\"a-nostyle\"]>li"));
        for(int i=0;i<options.size() ;i++) {
            if (options.get(i).getText().contains(filter)) {
                return i;
            }
        }
        return -1;
    }
    public WebElement FiltarOptions(String filter){
        int index;
        index= indexOfSpacificFilter(filter);
        List<WebElement> options= driver.findElements(By.cssSelector("span[aria-label=\"Departments filter\"]>ul[class=\"a-nostyle\"]>li"));
        return options.get(index);
    }
    public WebElement discountOption(String discount){
        if(discount.contains("10")){
            return driver.findElements(By.cssSelector("span[aria-label=\"Discount filter\"]>ul>li")).get(1);
        }
        else if(discount.contains("25")){
            return driver.findElements(By.cssSelector("span[aria-label=\"Discount filter\"]>ul>li")).get(2);
        }
        else if(discount.contains("50")){
            return driver.findElements(By.cssSelector("span[aria-label=\"Discount filter\"]>ul>li")).get(3);
        }
        else if(discount.contains("70")){
            return driver.findElements(By.cssSelector("span[aria-label=\"Discount filter\"]>ul>li")).get(4);
        }
        else
            return null;

    }
    public WebElement SelectElement(int index){
        return driver.findElements(By.cssSelector("div[class=\"Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y\"]>div")).get(index);
    }


}

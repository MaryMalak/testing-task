package AmazonPages;

import StepDefinitions.A_Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver ;
    int indexItemInSearch;

    public SearchPage( ) {
        this.driver = A_Hooks.driver;
    }
    public WebElement firstItemInTheResult(){
        indexItemInSearch=5;
        return driver.findElement(By.cssSelector
                ("span>div[class=\"s-main-slot s-result-list s-search-results sg-row\"]>div[data-index=\""+indexItemInSearch+"\"]")) ;
    }

}

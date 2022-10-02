package StepDefinitions;

import AmazonPages.HomePage;
import AmazonPages.ProductDetailedPage;
import AmazonPages.SearchPage;
import AmazonPages.TodayDealsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Task1Scenario2StepDef {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();
    ProductDetailedPage productDetailedPage=new ProductDetailedPage();
    TodayDealsPage todayDealsPage=new TodayDealsPage();
    boolean itemIsAvailable;

    @When("User opens today's deals")
    public void UserOpenTodayDeals() throws InterruptedException {
        homePage.donnotChangeCurrencyBtn().click();
        homePage.TodayDealsBtn().click();
    }

    @And("User selects {string} and {string} from filters")
    public void userSelectsFromFilters(String filter1, String filter2)  {
        todayDealsPage.FiltarOptions(filter1).click();
        todayDealsPage.FiltarOptions(filter2).click();

    }

    @And("User choose {string} from the discount part")
    public void userChooseFromTheDiscountPart(String discount)  {
        todayDealsPage.discountOption(discount).click();

    }


    @And("User add item number {string} to the cart")
    public void userAddItemToTheCart(String arg0) throws InterruptedException {
        int index=Integer.parseInt(arg0) ;
        todayDealsPage.SelectElement(index).click();
        Thread.sleep(3000);
    }
}

package StepDefinitions;

import AmazonPages.HomePage;
import AmazonPages.ProductDetailedPage;
import AmazonPages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task1Scenario1StepDef {

    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();
    ProductDetailedPage productDetailedPage=new ProductDetailedPage();
    boolean itemIsAvailable;

    @When("User types \"car accessories\" in the search")
    public void UserWriteInSearch() throws InterruptedException {
        homePage.SearchTextLine().sendKeys("car accessories");
        homePage.SearchBtn().click();

    }

    @And("User Selects the first Item from the results")
    public void userSelectsTheFirstItemFromTheResults() throws InterruptedException {
        searchPage.firstItemInTheResult().click();
        Thread.sleep(2000);

    }

    @And("If this item is available in stock user Adds it to the cart")
    public void userAddsItemToTheCart() {
        itemIsAvailable=productDetailedPage.itemIsAvailable();
        if(itemIsAvailable) {
            productDetailedPage.addToCartBtn().click();
        }
    }

    @Then("\"Added to Cart\" message is displayed")
    public void userFindsThisItemInTheCart() {
        if (itemIsAvailable){
            String expectedResult="Added to Cart";
            String actualResult=productDetailedPage.cartMessage().getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(expectedResult));
        }
        }

    }


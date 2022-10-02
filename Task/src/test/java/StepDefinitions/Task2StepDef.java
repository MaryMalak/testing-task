package StepDefinitions;

import KSRTCpages.HomePage;
import KSRTCpages.SerrvicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Task2StepDef {
    HomePage homePage=new HomePage();
    SerrvicesPage serrvicesPage=new SerrvicesPage();

    @When("User choose CHIKKAMAGALURU to BENGALURU from the popular routes")
    public void mm() throws InterruptedException {
        while(!homePage.secCarouselIsActive());
        homePage.fromCHIKKAMAGALURUtoBENGALURU().click();
    }

    @And("click the arrival date only")
    public void userClicksTheArrivalDateOnly() {
        homePage.SetDateOfArrivalTxtLine("28");
    }

    @And("click Search for bus")
    public void userClicksSearchForBus()  {
        homePage.ClickSearchForBusBtn();

    }

    @And("select a seat")
    public void userSelectsASeat() throws InterruptedException {
        homePage.selectSeat(1).click();
        System.out.println("ooooooook");
        Thread.sleep(5000);
    }

    @And("Choose the boarding point and dropping point")
    public void chooseTheBoardingPointAndDroppingPoint() throws InterruptedException {
        Thread.sleep(3000);
        serrvicesPage.boardingPoint().click();
        serrvicesPage.firstOptionInDroppingPoint().click();

    }

    @And("Fill the Customer details \\(phone number:{string} & email {string})")
    public void fillTheCustomerDetailsPhoneNumberEmail(String phoneNumber, String email) {
        serrvicesPage.CDphoneLineTxt().sendKeys(phoneNumber);
        serrvicesPage.CDemailLineTxt().sendKeys(email);
    }

    @And("Fill the Passenger details")
    public void fillThePassengerDetails() {
    }

    @And("Choose available seat\\( row{string} column {string})")
    public void chooseAvailableSeatRowColumn(String row, String column) throws InterruptedException {
        serrvicesPage.Seat(row,column).click();
        Thread.sleep(5000);
    }
}

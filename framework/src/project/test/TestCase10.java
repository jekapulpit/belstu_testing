package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.*;

public class TestCase10 extends Base {

    @Test
    public void testCase10() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "SearchResult page did not opened");
        searchResultPage.shortlist.waitVisibilityOfElement();
        searchResultPage.shortlist.waitClickableOfElementLocated();
        searchResultPage.hotelName.waitClickableOfElementLocated();
        searchResultPage.hotelName.click();
        HotelPage hotelPage = new HotelPage();
        Assert.assertTrue(hotelPage.hotelPanel.isDisplayed(), "Hotel page did not opened");
        hotelPage.bookNow.hoverElement();
        hotelPage.bookNow.click();
        HolidayDetailsPage holidayDetailsPage = new HolidayDetailsPage();
        Assert.assertTrue(holidayDetailsPage.holiday.isDisplayed(), "HolidayDetails page did not opened");
        holidayDetailsPage.medical.click();
        holidayDetailsPage.continueSecurely.waitClickableOfElementLocated();
        holidayDetailsPage.continueSecurely.click();
        YourDetailsPage yourDetailsPage = new YourDetailsPage();
        Assert.assertTrue(yourDetailsPage.details.isDisplayed(), "yourDetails page did not opened");
        yourDetailsPage.firstName.sendKeys("Evgeniy");
        yourDetailsPage.surname.sendKeys("Dubovik");
        yourDetailsPage.email.sendKeys("vse.devochki.moi@gmail.com");
        yourDetailsPage.phone.sendKeys("+375291234567");
        yourDetailsPage.postcode.sendKeys("NW1 2DS");
        yourDetailsPage.findThisAddress.hoverElement();
        yourDetailsPage.findThisAddress.click();
        yourDetailsPage.continueSecurely.hoverElement();
        yourDetailsPage.continueSecurely.click();
        ReviewAndPaymentPage reviewAndPaymentPage = new ReviewAndPaymentPage();
        Assert.assertTrue(reviewAndPaymentPage.review.isDisplayed(), "reviewAndPayment page did not opened");
    }
}

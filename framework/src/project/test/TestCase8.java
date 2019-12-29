package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.HolidayDetailsPage;
import project.pageObject.HotelPage;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase8 extends Base {

    @Test
    public void testCase8() {
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
        holidayDetailsPage.continueSecurely.click();
        holidayDetailsPage.error.waitVisibilityOfElement();

    }
}

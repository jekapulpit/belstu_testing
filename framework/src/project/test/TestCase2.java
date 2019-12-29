package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase2 extends Base {


    @Test
    public void testCase2() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "SearchResult page did not opened");
        searchResultPage.shortlist.waitClickableOfElementLocated();
        searchResultPage.shortlist.click();
        String HotelName = searchResultPage.hotelName.getText().toLowerCase();
        searchResultPage.myShortList.click();
        searchResultPage.hotelInShortList.waitClickableOfElementLocated();
        String a = searchResultPage.hotelInShortList.getText().toLowerCase();
        Assert.assertEquals(a, HotelName, "Hotel does not located in my short list");
    }
}

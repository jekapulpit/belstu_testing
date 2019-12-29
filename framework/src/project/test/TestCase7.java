package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase7 extends Base {

    @Test
    public void testCase7() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.destinations.hoverElement();
        mainPage.Cornwall.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "SearchResult page did not opened");
        searchResultPage.regions.waitVisibilityOfElement();
        Assert.assertEquals(searchResultPage.regions.getText(),"Cornwall, England", "Its not all regions");
    }
}

package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class SearchResultPage {
    public Label resultPanel = new Label(By.xpath("//div[@id='result-wrapper']"), "resultPanel");
    public Label regions = new Label(By.xpath("//span[@class='fsb message-region']"),"regions");
    public Button shortlist = new Button(By.xpath("(//span[@class='icon-heart-open-b'])[1]"), "shortlist button");
    public Button myShortList = new Button(By.xpath("//a[@id='link-shortlist']"),"MyShortList");
    public Label hotelName = new Label(By.xpath("(//a[@class='headerLink fl'])[1]"),"Hotel name");
    public Label hotelInShortList = new Label(By.xpath("//div[contains(@class,'search-info column small-12 large-12 medium-12')]//h3"), "hotel in my shortlist");
    public Button clearShortList = new Button(By.xpath("(//a[@id='shortlist-clear'])[1]"), "clear shortlist");
}

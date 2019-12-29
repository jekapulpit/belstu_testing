package project.pageObject;

import framework.elements.Label;
import framework.elements.Button;
import framework.utils.LogUtils;
import org.openqa.selenium.By;

public class MainPage {

    public Label panelSearch = new Label(By.xpath("//div[contains(@class,'row nav-panel')]"),"Pannel search");
    public Button search = new Button(By.xpath("//button[@class='go-search button']"), "search");
    public Button destinations = new Button(By.xpath("//div[@id='-link-destinations']"), "destinations");
    public Button Cornwall = new Button(By.xpath("(//a[@href='/england/cornwall'])[1]"), "Cornwall");
}

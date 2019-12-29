package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class HotelPage {
    public Label hotelPanel = new Label(By.xpath("//div[contains(@class,'posrel ofh w100 propHead-hold')]"),"hotelPanel");
    public Button viewMap = new Button(By.xpath("//a[@data-attr-scroll='map']"),"viewMap");
    public Button postcode = new Button(By.xpath("//input[@id='u_pcode']"),"postcode input");
    public Button getDriveTime = new Button(By.xpath("//a[@id='user_distance']"),"get drive time");
    public Label timeResults = new Label(By.xpath("//strong[contains(@class,'green upc')]"),"time results");
    public Label error = new Label(By.xpath("//div[@id='drive_time_results']"), "error");
    public Button bookNow = new Button(By.xpath("//span[contains(@class,'pad6 padl')]"),"book now");

}

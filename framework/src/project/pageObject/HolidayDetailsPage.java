package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class HolidayDetailsPage {

    public Label error = new Label(By.xpath("//div[@class='errorText']"), "error");
    public Label holiday = new Label(By.xpath("//span[@id='HolidaySelection']"),"holiday selection");
    public Button continueSecurely = new Button(By.xpath("//a[@id='contBooking']"), "continue securely");
    public Button medical = new Button(By.xpath("//label[@for='rdoInsuranceNo']"),"medical");
}

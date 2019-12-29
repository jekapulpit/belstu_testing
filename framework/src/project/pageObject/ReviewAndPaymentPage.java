package project.pageObject;

import framework.elements.Label;
import org.openqa.selenium.By;

public class ReviewAndPaymentPage {
    public Label review = new Label(By.xpath("//div[@class='accommodationPriceContainer']"),"review label");
}

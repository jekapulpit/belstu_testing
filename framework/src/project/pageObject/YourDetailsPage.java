package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class YourDetailsPage {
    public Label details = new Label(By.xpath("//div[@id='personaldetailsform']"),"details");
    public Button firstName = new Button(By.xpath("//input[@id='txtFirstAdultName']"),"firstname");
    public Button surname = new Button(By.xpath("//input[@id='txtFirstAdultSurname']"),"lastname");
    public Button email = new Button(By.xpath("//input[@id='EmailValidationUserControl_EmailAddress']"),"email");
    public Button phone = new Button(By.xpath("//input[@id='txtPhoneNumber']"),"phone");
    public Button postcode = new Button(By.xpath("//input[@id='AddressValidation_PostCodeLookupTextBox']"),"postcode");
    public Button findThisAddress = new Button(By.xpath("//input[@id='AddressValidation_AddressLookupButton']"),"find this address");
    public Button continueSecurely = new Button(By.xpath("//span[contains(@class,'fl pad6 padl marg15 margr fs130 lh1')]"),"continuesecurely");

}

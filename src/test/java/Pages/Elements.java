package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(linkText="Register")
    public WebElement register;

    @FindBy(id="customer.firstName")
    public WebElement firstName;

    @FindBy(id="customer.lastName")
    public WebElement lastName;

    @FindBy(id="customer.address.street")
    public WebElement address;

    @FindBy(id="customer.address.city")
    public WebElement city;

    @FindBy(id="customer.address.state")
    public WebElement state;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id="customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id="customer.ssn")
    public WebElement ssn;

    @FindBy(id="customer.username")
    public WebElement userName;

    @FindBy(id="customer.password")
    public WebElement password;

    @FindBy(id="repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath="(//*[@class='button'])[3]")
    public WebElement RegisterDone;

    @FindBy(xpath="//*[@class='title']")
    public WebElement headText;
}

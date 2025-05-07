package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement loginbutton;

    @FindBy(xpath = "//*[@id='rightPanel']/h1")
    public WebElement loginErrorMessage;



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniPage {

    public WebUniPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Our Products")
    public WebElement ourProductLinki;

    @FindBy(xpath = "//iframe[@id='frame']")
    public WebElement iframeElementi;

    @FindBy(id ="camera-img")
    public WebElement camerasElementi;

    @FindBy(xpath = "//h4")
    public WebElement alertYaziElementi;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement alertCloseButton;

    @FindBy(xpath = "(//*[@id='nav-title'])[1]")
    public WebElement webDriverLinki;









}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*
    TestNG' de page class'lari surekli kulladigimiz bir sayfa / web sitesi'ndeki
    locate'leri ve ilgili sayfada kullanilacak login gibi basit methodlari icerir.

    TestNG page class'larindaki locate'lere erisim icin Test class'larinda Page Class'indan
    Obje olusturulmasini benimsemistir.

     */

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id ="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElemeti;

}

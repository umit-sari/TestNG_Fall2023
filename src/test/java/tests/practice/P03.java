package tests.practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {

    @Test
    public void amazonAramaTesti(){

        // Amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // iPhone 15 PRO icin arama yapin
        // Arama kutusunun locator'ina ihtiyacimiz var
        // locator'larimiz artik pages class'larinda
        // Locator'lar static olmadigi icin obje olusturarak kullanabiliriz

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime3")+Keys.ENTER);

        String actualResult=amazonPage.sonucYaziElementi.getText();
        String expectedResult=ConfigReader.getProperty("amazonAranacakKelime3");

        Assert.assertTrue(actualResult.contains(expectedResult));

        Driver.closeDriver();

    }
}

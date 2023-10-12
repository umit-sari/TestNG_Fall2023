package tests.day16_TestNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void nutellaTesti(){
        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // Nutella aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // Arama sonuclarinin Nutella icerdigini test edin
        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        // driver'i kapatalim
        Driver.closeDriver();





    }
}

package tests.practice;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P04 {

   @Test
   public void qualitydemyTest(){

       //1- https://www.qualitydemy.com/ anasayfasina gidin

       Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

       //2- login linkine basin

       QualitydemyPage qualitydemyPage=new QualitydemyPage();

       qualitydemyPage.cookieButton.click();// cookies ciktigi icin

       qualitydemyPage.ilkLoginLinki.click();

// 3- Kullanici email'i olarak valid email girin

       qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
       qualitydemyPage.cookie2Butonu.click(); // tekrardan cikan cookies i kabul etmek icin
       ReusableMethods.bekle(2);

// 4- Kullanici sifresi olarak valid sifre girin
       qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


// 5- Login butonuna basarak login olu
       qualitydemyPage.loginButonu.click();
// 6- Basarili olarak giris yapilabildigini test edin
       Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());

       Driver.closeDriver();


   }


}

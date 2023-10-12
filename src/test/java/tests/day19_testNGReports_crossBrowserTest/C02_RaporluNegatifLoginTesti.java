package tests.day19_testNGReports_crossBrowserTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluNegatifLoginTesti extends TestBaseRapor {
    QualitydemyPage qualitydemyPage;

    @Test
    public void gecersizPasswordTest(){
        extentTest=extentReports.createTest("gecersiz Password test",
                "kullanici gecersiz password ve gecerli username ile giris yapamamali");

        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("kullanici qualitydemy anasayfasina gider");

        qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.cookieButton.click();

        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("kullanici ilk login buttonuna basar");
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        extentTest.info("kullanici gecerli username yazar");
        qualitydemyPage.passwordKutusu.sendKeys("152032");
        extentTest.info("kullanici gecersiz password giris yapar");
        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();
        extentTest.info("kullanici login buttonuna basar");

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");

        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");

    }
    @Test
    public void gecersizEmailTest(){
        extentTest=extentReports.createTest("gecersiz Password test",
                "kullanici gecerli password ve gecersiz username ile giris yapamamali");
        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("kullanici qualitydemy anasayfasina gider");

        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.cookieButton.click();

        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("kullanici ilk login buttonuna basar");

        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("kullanici gecersiz username yazar");

        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        extentTest.info("kullanici gecerli password giris yapar");

        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();
        extentTest.info("kullanici login buttonuna basar");


        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");

        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");

    }

    @Test
    public void gecersizEmailPasswordTesti(){
        extentTest=extentReports.createTest("gecersiz Password test",
                "kullanici gecersiz password ve gecersiz username ile giris yapamamali");
        Driver.getDriver().get("https://www.qualitydemy.com/ ");
        extentTest.info("kullanici qualitydemy anasayfasina gider");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.cookieButton.click();

        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("kullanici ilk login buttonuna basar");

        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("kullanici gecersiz username yazar");

        qualitydemyPage.passwordKutusu.sendKeys("12345");
        extentTest.info("kullanici gecersiz password giris yapar");

        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();
        extentTest.info("kullanici login buttonuna basar");

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");

        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");
    }


}

package tests.day16_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_QualitydemyNegatifLoginTesti {
    QualitydemyPage qualitydemyPage;

    @Test
    public void gecersizPasswordTest(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.cookieButton.click();

        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();

    }
    @Test
    public void gecersizEmailTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.cookieButton.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();


        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void gecersizEmailPasswordTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/ ");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.cookieButton.click();

        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.cookie2Butonu.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }


}

package tests.day16_TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverClassKullanimi {

    @Test
    public void amazonTest(){

        Driver.getDriver().get("https://www.amazon.com");

       WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

       aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

       Driver.closeDriver();


    }
    @Test
    public void youtubeTest(){
        Driver.getDriver().get("https://www.youtube.com");

        Driver.closeDriver();

    }
}

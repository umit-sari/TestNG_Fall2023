package tests.practice;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEpage;
import utilities.ConfigReader;
import utilities.Driver;

public class P05 {

    @Test
    public void AETest(){

        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        AEpage aepage=new AEpage();

        aepage.signUp.click();
        aepage.registerName.sendKeys("umit62");
        aepage.registerEmail.sendKeys("umit@gmail.com");
        aepage.signupButton.click();
        aepage.gender1.click();
        aepage.password.sendKeys("12346578");
        aepage.firstName.sendKeys("umit62");
        aepage.lastName.sendKeys("QA");
        aepage.address.sendKeys("Istanbul");

        Select select=new Select(aepage.country);
        select.selectByValue("United States");// options daki value değeri yazılır.
        //select.selectByVisibleText("United States"); // sayfada görünen değer

        aepage.state.sendKeys("Istanbul");
        aepage.city.sendKeys("Istanbul");
        aepage.zipcode.sendKeys("34000");
        aepage.mobileNumber.sendKeys("05300000000"+ Keys.ENTER);
        // aepage.createAccount.click(); keys.Enter yerine bu kodu da yazabiliriz.Bazen keys.Enter calismayabilir

        String expectedVerify="ACCOUNT CREATED!";
        String actualVerify=aepage.regverify.getText(); // regverify - account created
        Assert.assertTrue(actualVerify.contains(expectedVerify));






    }
}

package Test_script;

import DataProvider.CheckOfferData;
import Launch_Browser.Launch;
import POM.CheckOffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOffer_Script extends Launch {
    @Test(priority = 0)
    public void checkOffers(){
        CheckOffer checkOffer=new CheckOffer(driver);
        checkOffer.clickOffer();
        checkOffer.clickReward();
        WebElement scrollelement = driver.findElement(By.xpath("//*[@data-id='offers-PAYBACK-POINTS']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
        boolean status=checkOffer.Reward();
        Assert.assertEquals(true,status);
    }
    @Test(dataProvider ="ICICoffer",dataProviderClass = CheckOfferData.class,priority = 1)
    public void checkOffersPositiveScenario(String offer) throws InterruptedException {
        CheckOffer checkOffer=new CheckOffer(driver);
        checkOffer.clickOffer();
        checkOffer.searchofferbox(offer);
        WebElement scrollelement = driver.findElement(By.xpath("//div[@class='__description']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
        Thread.sleep(5000);
        boolean flag= checkOffer.iCIC();
        Assert.assertEquals(true,flag);

        }
    @Test(dataProvider ="Kotak",dataProviderClass = CheckOfferData.class,priority = 2)
    public void NegativeScenario(String find) throws InterruptedException {
        CheckOffer checkOffer=new CheckOffer(driver);
        checkOffer.clickOffer();
        checkOffer.searchofferbox(find);
        boolean flag= checkOffer.nomatchResult();
        Assert.assertEquals(true,flag);
        Thread.sleep(4000);


    }


}

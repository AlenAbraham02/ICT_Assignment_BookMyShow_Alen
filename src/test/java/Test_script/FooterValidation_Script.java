package Test_script;

import Launch_Browser.Launch;
import POM.FooterValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FooterValidation_Script extends Launch {
   @Test
   public void footerTextValidation(){
       FooterValidation footerValidation=new FooterValidation(driver);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement Element = driver.findElement(By.xpath("//h4[contains (text(), 'BOOKMYSHOW APP ')]"));
       //This will scroll the page till the element is found

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       boolean status=footerValidation.footer();
       Assert.assertEquals(true,status);
       js.executeScript("arguments[0].scrollIntoView();", Element);
   }
}

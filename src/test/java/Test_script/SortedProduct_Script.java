package Test_script;

import Launch_Browser.Launch;
import POM.SortedProduct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedProduct_Script extends Launch {

    @Test
    public void validateSortedProduct() throws InterruptedException {
        SortedProduct sortedProduct=new SortedProduct(driver);
        sortedProduct.fanhoodClick();
        boolean urlName=sortedProduct.verifyurl();
        Assert.assertEquals(true,urlName);
        sortedProduct.productClick();
        sortedProduct.lunchbagClick();
        boolean flag= sortedProduct.sortingLunchBag();
        Assert.assertEquals(true,flag);
        Thread.sleep(10000);
    }


}

package Test_script;

import Launch_Browser.Launch;
import POM.FilterPrice;
import POM.SortedProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Filterprice_Script extends Launch {
    @Test
    public void validateFilerbyPrice() throws InterruptedException {
        SortedProduct sortedProduct=new SortedProduct(driver);
        sortedProduct.fanhoodClick();
        boolean flag =sortedProduct.verifyurl();
        Assert.assertEquals(true,flag);
        sortedProduct.productClick();

        FilterPrice filterPrice=new FilterPrice(driver);
        filterPrice.plannerClick();
        filterPrice.countVerification();
        filterPrice.sortPlanner();
        boolean status=filterPrice.productDisplay();
        Assert.assertEquals(true,status);
        Thread.sleep(10000);
    }
}

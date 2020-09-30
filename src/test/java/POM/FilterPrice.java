package POM;

import Launch_Browser.Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FilterPrice extends Launch {
    public WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[3]/ul/li[6]/a")
    WebElement planner;
    @FindBy (xpath = "//*[@id=\"sidebar-filter\"]/div[2]/li/ul/li[1]/span[2]")
    WebElement price;
    @FindBy(xpath = "//*[@id=\"shopify-section-mm-collection-template\"]/section/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/span")
    WebElement verification;
    @FindBy (xpath="//div[@class='product-list product-list--collection product-list--with-sidebar']")
    WebElement ListofProduct;

    public FilterPrice(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void plannerClick() {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[3]/ul/li[6]/a")));
        planner.click();
    }

        public void countVerification () {
            ListofProduct.click();
            List productList= driver.findElements(By.xpath("//div[@class='product-item product-item--vertical  1/3--tablet-and-up 1/4--desk']"));
            System.out.println("Count =" + productList.size());
        }

        public void sortPlanner () {
            wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sidebar-filter\"]/div[2]/li/ul/li[1]/span[2]")));
            price.click();

        }
        public boolean productDisplay () {
            if (verification.getText().contains("Showing 2 out of 5 products.")) {
                return true;
            } else {
                return false;
            }

        }
    }

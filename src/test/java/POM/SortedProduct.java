package POM;

import Launch_Browser.Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortedProduct extends Launch {
    public WebDriverWait wait;
    @FindBy(linkText = "Fanhood")
    private WebElement Fanhood;
    @FindBy(linkText = "Products")
    private WebElement Product;
    @FindBy (xpath = "//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[8]/ul/li[2]/a")
    private WebElement lunchbag;

    public  SortedProduct(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void fanhoodClick(){
        Fanhood.click();
    }
    public boolean verifyurl(){
        String currentUrl=driver.getCurrentUrl();
        if (currentUrl.contains("fanhood")){
            return true;
        }
        else return false;
    }
    public void productClick(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Products")));
        Product.click();
    }

    public void lunchbagClick(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[8]/ul/li[2]/a")));
        lunchbag.click();
    }

    public boolean sortingLunchBag(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ajaxSort']")));
        Select dropDown=new Select(driver.findElement(By.xpath("//select[@id='ajaxSort']")));
        dropDown.selectByVisibleText("Alphabetically: Z-A");
        if (dropDown.getFirstSelectedOption().getText().equals("Alphabetically: Z-A")){
            return true;
        }
        else return false;

    }
}

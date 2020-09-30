package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseCity {
    @FindBy(xpath = "//span[@id='spnSelectedRegion']")
    private WebElement Region;
    @FindBy(xpath = "//input[@id='inp_RegionSearch_top']")
    private WebElement Search;
    @FindBy(xpath = "//div[@class='tt-suggestion tt-selectable']")
    private WebElement Goa;

    public ChooseCity(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void city() {
        Region.click();
    }

    public void searchRegion(String s1) {
        Search.sendKeys(s1);
        Search.sendKeys(Keys.ENTER);
    }

}
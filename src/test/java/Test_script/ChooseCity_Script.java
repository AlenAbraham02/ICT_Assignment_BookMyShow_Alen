package Test_script;

import DataProvider.ChooseCityData;
import Launch_Browser.Launch;
import POM.ChooseCity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChooseCity_Script extends Launch {

    @Test(dataProvider = "Region", dataProviderClass = ChooseCityData.class)
    public void chooseCity(String cityname) {
        ChooseCity chooseCity = new ChooseCity(driver);
        chooseCity.city();
        chooseCity.searchRegion(cityname);
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        WebElement waitElement3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));

    }
}


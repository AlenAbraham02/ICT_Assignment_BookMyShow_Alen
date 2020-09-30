package Test_script;

import DataProvider.CastandCrewData;
import Launch_Browser.Launch;
import POM.CastandCrew;
import POM.SearchMovie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CastandCrew_Script extends Launch {
    @Test(dataProvider = "Crew", dataProviderClass = CastandCrewData.class)
    public void castandCrewPostiveScenario(String movie,String Actor, String Musician) throws InterruptedException {
        SearchMovie searchMovie = new SearchMovie(driver);
        searchMovie.Click();
        searchMovie.movies(movie);
        CastandCrew castandCrew = new CastandCrew(driver);
        castandCrew.actor(Actor,Musician);
        boolean flag = castandCrew.onwards();
        Assert.assertEquals(true, flag);
        WebElement scrollelement = driver.findElement(By.xpath("//div[@content='Mychael Danna']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
        Thread.sleep(4000);
    }
}


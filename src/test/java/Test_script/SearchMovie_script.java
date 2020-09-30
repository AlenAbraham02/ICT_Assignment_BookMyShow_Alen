package Test_script;

import DataProvider.SearchMovieData;
import Launch_Browser.Launch;
import POM.SearchMovie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchMovie_script extends Launch {
    @Test(dataProvider = "MovieName", dataProviderClass = SearchMovieData.class,priority = 0)
    public void searchMoviePositiveScenario(String Moviename) throws InterruptedException {
        SearchMovie searchMovie = new SearchMovie(driver);
        searchMovie.Click();
        searchMovie.movies(Moviename);
        boolean flag=searchMovie.validmovie();
        Assert.assertEquals(true,flag);

    }

    @Test(dataProvider = "InvalidMovieName", dataProviderClass = SearchMovieData.class,priority = 1)
    public void searchMovieNegativeScenario(String movie) throws InterruptedException {
        SearchMovie searchMovie = new SearchMovie(driver);
        searchMovie.Click();
        searchMovie.movies(movie);
        Thread.sleep(6000);
        boolean flag=searchMovie.invalidMovie();
        Assert.assertEquals(true,flag);
    }
}
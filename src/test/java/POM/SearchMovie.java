package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMovie{
    @FindBy(name = "inputSearchBox")
    private WebElement Search;
    @FindBy(xpath="//h1[@id='eventTitle']")
    private WebElement ValidMoviename;
    @FindBy(xpath = "//span[@class='__red-text']")
    private WebElement Noresult;

//    @FindBy(name = "inputSearchBox")
//    private WebElement movie;
//    @FindBy(id = "eventTitle")
//    private WebElement ismoviepresrnt;
//    @FindBy(xpath = "//button[@class='No thanks']")
//    private WebElement notnow;

    public SearchMovie(WebDriver driver)
    { PageFactory.initElements(driver,this);}

    public void Click(){
        Search.click();
    }

    public void movies(String S1) throws InterruptedException {
        Search.sendKeys(S1);
        Thread.sleep(3000);

        Search.sendKeys(Keys.ENTER);
    }
    public boolean validmovie(){
        if(ValidMoviename.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean invalidMovie(){
        if(Noresult.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }



}

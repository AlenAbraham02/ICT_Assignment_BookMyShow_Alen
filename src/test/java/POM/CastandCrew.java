package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CastandCrew {
    @FindBy(xpath = "//div[@content='Tom Holland']")
    private WebElement Actor;
    @FindBy(xpath = "//div[@content='Mychael Danna']")
    private WebElement Musician;

    public CastandCrew(WebDriver driver)
    { PageFactory.initElements(driver,this);}
    public boolean actor(String a1,String m1) {
        if (Actor.getText() == a1 && Musician.getText() == m1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean onwards(){
        if(Actor.isDisplayed()&&Musician.isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }
}
package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOffer {
    @FindBy(linkText = "Offers")
    private WebElement Offer;
    @FindBy(xpath = "//li[@data-id='rewards']")
    private WebElement Rewards;
    @FindBy(xpath="//*[@data-id='offers-Reward-Points-Redemption']")
    private WebElement RewardPoints;
    @FindBy(xpath="//*[@data-id='offers-PAYBACK-POINTS']")
    private WebElement PaybackPoint;
    @FindBy(xpath = "//*[@data-id='offers-SimplyCLICK-SBI-Card-Rewards-Offer']")
    private WebElement SBICard;


    @FindBy(xpath="//*[@id='ajax-typeahead']")
    private WebElement SearchField;

    @FindBy(xpath="//div[@class='__description']")
    private WebElement Discountoffer;

    @FindBy(xpath="//div[@class='tt-no-results']")
    private WebElement NoMatch;


    public CheckOffer(WebDriver driver)
    { PageFactory.initElements(driver,this);}

    public void clickOffer(){
        Offer.click();
    }
    public void clickReward(){
        Rewards.click();
    }
    public boolean Reward(){
        if(RewardPoints.isDisplayed()&&PaybackPoint.isDisplayed()&&SBICard.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }

    public void searchofferbox(String s1){
        SearchField.sendKeys(s1);
        SearchField.sendKeys(Keys.ENTER);
    }
    public boolean iCIC(){
        if(Discountoffer.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean nomatchResult(){
    if(NoMatch.isDisplayed()){
        return true;
    }
    else {
        return false;
    }
    }

}

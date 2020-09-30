package POM;

import Launch_Browser.Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class List_your_show extends Launch {
    @FindBy(linkText = "ListYourShow")
    private WebElement ListYourShow;

    @FindBy(xpath = "//div[contains (text(), 'Online Streaming')]")
    private WebElement Online_streaming;
    @FindBy(xpath = "//div[contains (text(), 'Performances')]")
    private WebElement performances;
    @FindBy(xpath = "//div[contains (text(), 'Experiences')]")
    private WebElement Experiences;
    @FindBy(xpath = "//div[contains (text(), 'Expositions')]")
    private WebElement Expositions;
    @FindBy(xpath = "//div[contains (text(), 'Parties')]")
    private WebElement Parties;
    @FindBy(xpath = "//div[contains (text(), 'Sports')]")
    private WebElement Sports;
    @FindBy(xpath = "//div[contains (text(), 'Conferences')]")
    private WebElement Conferences;

    @FindBy(xpath = "//div[contains (text(), 'Online Sales & Marketing')]")
    private WebElement Online_Sales;
    @FindBy(xpath = "//div[contains (text(), 'Pricing')]")
    private WebElement Pricing;
    @FindBy(xpath = "//div[contains (text(), 'Food & beverages, stalls and the works!')]")
    private WebElement Food_beverages;
    @FindBy(xpath = "//div[contains (text(), 'On ground support  & gate entry management')]")
    private WebElement ground_support;
    @FindBy(xpath = "//div[contains (text(), 'Reports & business insights')]")
    private WebElement Reports_business;
    @FindBy(xpath = "//div[contains (text(), 'POS, RFID, Turnstiles & more...')]")
    private WebElement POS_RFID;



    @FindBy(xpath ="//div[contains (text(), 'In depth reports')]")
    private WebElement depth_reports;
    @FindBy(xpath ="//div[contains (text(), 'Access registration data')]")
    private WebElement Access_registration;
    @FindBy(xpath="//div[contains (text(), 'behavioural insights')]")
    private WebElement behavioural;

    public List_your_show(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void ListYourShowClick()  {
        ListYourShow.click();


    }
    public boolean host(){
        if(Online_streaming.isDisplayed()&&performances.isDisplayed()&&Experiences.isDisplayed()&&Expositions.isDisplayed()&&Parties.isDisplayed()&&Sports.isDisplayed()&&Conferences.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean services(){

        if(Online_Sales.isDisplayed()&&Pricing.isDisplayed()&&Food_beverages.isDisplayed()&&ground_support.isDisplayed()&&Reports_business.isDisplayed()&&POS_RFID.isDisplayed()){
         return true;
        }
        else{
            return false;
        }
    }
    public void reportClick(){
        Reports_business.click();
    }
    public boolean report(){
        if(depth_reports.isDisplayed()&&Access_registration.isDisplayed()&&behavioural.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }


}


package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  SelectLanguage {
    @FindBy(xpath = "//a[@class='nav-link']")
    private WebElement Language;
    @FindBy(xpath = "//li[@data-val='eng']")
    private WebElement English;
    @FindBy(xpath = "//li[@data-val='hin']")
    private WebElement Hindi;
    @FindBy(xpath = "//li[@data-val='mar']")
    private WebElement Marati;
    @FindBy(xpath = "//li[@data-val='tam']")
    private WebElement Tamil;
    @FindBy(xpath = "//li[@data-val='tel']")
    private WebElement Telengu;
    @FindBy(xpath = "//li[@data-val='kan']")
    private WebElement Kanada;
    @FindBy(xpath = "//li[@data-val='mal']")
    private WebElement Malayalam;


    public SelectLanguage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void languageClick() {
        Language.click();
    }

    public void languageC() {

         String mala=Malayalam.getText();
         System.out.println("langauge are"+mala);
    }
    public int selectLanguage() {
        if  (English.isDisplayed() && Hindi.isDisplayed() && Marati.isDisplayed() && Tamil.isDisplayed() && Telengu.isDisplayed() && Malayalam.isDisplayed()) {
            return 7;
        }
        else{
            return 0;
        }
    }

    }




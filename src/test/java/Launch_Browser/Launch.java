package Launch_Browser;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Launch {
    public static WebDriver driver;
    public String url="https://in.bookmyshow.com";

    @BeforeMethod
    public void OpenBrowser() throws InterruptedException {
        String  browserName="chrome";
        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
                //disabled popup
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("useAutomationExtension", false);
                driver = new ChromeDriver(options);//launch browser
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "src//main//resources//IEDriverServer.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                InternetExplorerOptions ieoptions = new InternetExplorerOptions(capabilities);
                driver = new InternetExplorerDriver(ieoptions);
                break;
        }
        driver.manage().window().maximize();//maximize window
        driver.navigate().to(url);//navigate to url
        WebDriverWait Searchboxwait=new WebDriverWait(driver,20);
        WebElement Searchbox=Searchboxwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inp_RegionSearch_top")));

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //WebElement Search=driver.findElement(By.id("inp_RegionSearch_top"));
        Searchbox.sendKeys("kochi");
       // WebElement select=driver.findElement(By.xpath("//*[@id=\"inp_RegionSearch_top\"]"));
        Searchbox.sendKeys(Keys.ENTER);
        WebDriverWait PopUpwait=new WebDriverWait(driver,20);
        WebElement popUp=Searchboxwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wzrk-cancel")));
        //WebElement cancelButton = driver.findElement(By.id("wzrk-cancel"));
        popUp.click();
        Thread.sleep(6000);
//        return driver;
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    public static String takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String file = "ss" + random.nextInt(1000) + ".png";
        String fileName = System.getProperty("user.dir") + "\\report\\" + file;
        File destinationFile = new File(fileName);
        FileUtils.copyFile(screenshot, destinationFile);
        return file;


    }
}

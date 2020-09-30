package Test_script;

import Launch_Browser.Launch;
import POM.SelectLanguage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectLanguage_Script extends Launch {
    @Test
    public void selectLanguage(){
        SelectLanguage selectLanguage=new SelectLanguage(driver);
        selectLanguage.languageClick();
        int lan=selectLanguage.selectLanguage();
        Assert.assertEquals(7,lan);
        selectLanguage.languageC();


    }
}

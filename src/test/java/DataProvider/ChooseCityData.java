package DataProvider;

import org.testng.annotations.DataProvider;

public class ChooseCityData {
    @DataProvider(name = "Region")
    public static Object[][] dataproviderOffer() {
        return new Object[][]{
                {"Goa"}
        };
    }
}
package DataProvider;

import org.testng.annotations.DataProvider;

public class CastandCrewData {
    @DataProvider(name = "Crew")
    public static Object[][] dataproviderOffer() {
        return new Object[][]{
                {"Onward","Tom Holland","Mychael Danna"}

        };
    }
}
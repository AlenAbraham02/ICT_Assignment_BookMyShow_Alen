package DataProvider;

import org.testng.annotations.DataProvider;

public class CheckOfferData {
    @DataProvider(name = "ICICoffer")
    public static Object[][] dataproviderOffer() {
        return new Object[][]{
                {"ICICI Bank 25% Discount Offer"}


        };
    }
    @DataProvider(name = "Kotak")
    public static Object[][] dataproviderOffer2() {
        return new Object[][]{
                {"Kotak Mahindra Offer"}

        };
    }
}

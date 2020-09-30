package DataProvider;

import org.testng.annotations.DataProvider;

public class SearchMovieData {

        @DataProvider(name = "MovieName")
        public static Object[][] dataproviderOffer() {
            return new Object[][]{
                    {"Fantasy Island"}


            };
        }
        @DataProvider(name = "InvalidMovieName")
        public static Object[][] dataproviderOffer2() {
            return new Object[][]{
                    {"qq"}

            };
        }
    }



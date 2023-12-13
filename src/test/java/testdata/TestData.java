package testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] getdata() {
        Object[][] data = new Object[][]
                {
                        {" ", " ", "Required"},                                            //3 columns so 3 variables
                        {"test123@gmail.com", " ", "Required"},
                        {" ", "test123", "Required"},
                        {"test123@gmail.com", "test123", "Invalid credentials"}             //4 rows .... 4 times execution

                };
        return data;
    }

    @DataProvider(name = "user data")
    public Object[][] userdata() {
        Object[][] data = new Object[][]
                {
                        {"Admin", "Admin", "Paul Collings", "Enable"},                         //4 columns so 4 variables
                        {"Cassidy.Hope", "ESS", "Cassidy Hope", "Enable"},
                        {"Nina.Patel", "ESS", "Nina Patel", "Enable"},
                        {"Odis.Adalwin", "Admin", "Odis Adalwin", "Enable"}

                };
        return data;

    }



}
package com.sample.app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    @Parameters("engine")
    public void testCreateUser(String engine) {
        App app = new App(engine);
        app.searchBy();
    }

    @DataProvider(name = "dp", parallel = true)
    public Object[][] provideData() {
        return new Object[][] {
                {"google"},
                {"bing"}
        };
    }

    @Test(dataProvider = "dp")
    public void testCreateUserBy(String engine) {
        App app = new App(engine);
        app.searchBy();
    }

}

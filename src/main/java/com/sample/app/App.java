package com.sample.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class App {

    private String searchEngine;
    private Logger logger = Logger.getLogger(App.class.getName());

    public App(String searchEngine) {
        this.searchEngine = searchEngine;
    }

    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    public void searchBy() {
        WebDriver driver = getDriver();
        driver.get(String.format("https://www.%s.com", searchEngine));
        driver.manage().window().maximize();
        logger.fine("Opened web page...");
        driver.quit();
    }
}

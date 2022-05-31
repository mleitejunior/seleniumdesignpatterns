package com.mleitejunior.seleniumdesignpatterns.factory.crawler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class SearchCrawler {

    protected WebDriver webDriver;
    protected String searchPageUrl;

    protected SearchCrawler(String searchPageUrl) {
        this.searchPageUrl = searchPageUrl;
    }

    public abstract void search(String term);

    public void start() {
        System.out.println("INICIALIZANDO CRAWLER");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        webDriver = new FirefoxDriver();
    }

    public void stop() {
        System.out.println("TERMINANDO CRAWLER");
        webDriver.quit();
    }
}

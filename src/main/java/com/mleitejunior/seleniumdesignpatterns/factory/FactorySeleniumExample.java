package com.mleitejunior.seleniumdesignpatterns.factory;

import com.mleitejunior.seleniumdesignpatterns.factory.crawler.SearchCrawler;
import com.mleitejunior.seleniumdesignpatterns.factory.factory.SearchCrawlerFactory;

public class FactorySeleniumExample {

    public static void main(String[] args) {
        SearchCrawler googleSearch = SearchCrawlerFactory.createCrawler("GOOGLE");
        SearchCrawler bingSearch = SearchCrawlerFactory.createCrawler("BING");
        SearchCrawler defaultSearch = SearchCrawlerFactory.createCrawler("DEFAULT");

        googleSearch.start();
        bingSearch.start();
        defaultSearch.start();

        googleSearch.search("Teste no Google");
        bingSearch.search("Teste no BING");
        defaultSearch.search("Teste DEFAULT");

        googleSearch.stop();
        bingSearch.stop();
        defaultSearch.stop();
    }
}

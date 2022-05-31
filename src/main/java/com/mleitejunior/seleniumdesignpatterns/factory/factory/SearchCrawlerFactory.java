package com.mleitejunior.seleniumdesignpatterns.factory.factory;

import com.mleitejunior.seleniumdesignpatterns.factory.crawler.BingSearchCrawler;
import com.mleitejunior.seleniumdesignpatterns.factory.crawler.GoogleSearchCrawler;
import com.mleitejunior.seleniumdesignpatterns.factory.crawler.SearchCrawler;

public class SearchCrawlerFactory {

    private SearchCrawlerFactory() {
    }

    public static SearchCrawler createCrawler(String website) {
        SearchCrawler searchCrawler;

        switch (website.toUpperCase()) {
            case "BING":
                searchCrawler = new BingSearchCrawler();
                break;
            case "GOOGLE":
            default:
                searchCrawler = new GoogleSearchCrawler();
        }

        return searchCrawler;
    }
}

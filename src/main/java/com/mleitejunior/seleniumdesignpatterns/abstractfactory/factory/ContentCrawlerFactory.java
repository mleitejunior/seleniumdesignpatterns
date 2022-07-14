package com.mleitejunior.seleniumdesignpatterns.abstractfactory.factory;

import com.mleitejunior.seleniumdesignpatterns.factory.crawler.SearchCrawler;

public abstract class ContentCrawlerFactory {
    SearchCrawler searchCrawler;

    public ContentCrawlerFactory(SearchCrawler searchCrawler) {
        this.searchCrawler = searchCrawler;
    }
}

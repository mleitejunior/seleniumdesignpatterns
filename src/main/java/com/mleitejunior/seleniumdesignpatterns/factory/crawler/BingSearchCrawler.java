package com.mleitejunior.seleniumdesignpatterns.factory.crawler;

public class BingSearchCrawler extends SearchCrawler {
    private static final String URL_SEARCH_PAGE = "https://www.bing.com";

    public BingSearchCrawler() {
        super(URL_SEARCH_PAGE);
    }

    @Override
    public void search(String term) {
        webDriver.navigate().to(URL_SEARCH_PAGE);

        System.out.printf("BUSCANDO TERMO %s NO BING, ACESSADO PÁGINA %s%n", term, webDriver.getTitle());
    }
}

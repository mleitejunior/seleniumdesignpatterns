package com.mleitejunior.seleniumdesignpatterns.factory.crawler;

public class GoogleSearchCrawler extends SearchCrawler {
    private static final String URL_SEARCH_PAGE = "https://google.com";

    public GoogleSearchCrawler() {
        super(URL_SEARCH_PAGE);
    }

    @Override
    public void search(String term) {
        webDriver.navigate().to(URL_SEARCH_PAGE);

        System.out.printf("BUSCANDO TERMO %s NO GOOGLE, ACESSADO PÁGINA %s%n", term, webDriver.getTitle());
    }
}

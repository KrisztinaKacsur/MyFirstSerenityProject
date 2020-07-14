package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HeraldSearchResultPage;
import com.fasttrackit.pages.HomePage;
import net.thucydides.core.annotations.Step;


public class SearchSteps {

    private HomePage homePage;
    private HeraldSearchResultPage heraldSearchResultPage;

    @Step
    public void searchProduct () {
        homePage.open();
        homePage.searchForProduct();

    }
    @Step
    public void clickSearch(){
        homePage.clickOnSearchButton();
    }

    @Step
    public void verifyHeraldGlassVaseFound() {
        heraldSearchResultPage.verifyIfSearchGaveResult();
    }
}

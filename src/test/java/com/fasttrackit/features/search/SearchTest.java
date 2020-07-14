package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchForHeraldGlassVase () {
        searchSteps.searchProduct();
        searchSteps.clickSearch();
        searchSteps.verifyHeraldGlassVaseFound();
    }


}

package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/men/shirts.html")
public class MenShirtsPage extends PageObject {

    @FindBy(css = ".product-name [title='French Cuff Cotton Twill Oxford']")
    private WebElementFacade frenchCuffCottonTwillOxford;

    public void clickFrenchCuffCottonTwillOxford() {
        clickOn(frenchCuffCottonTwillOxford);
    }


}

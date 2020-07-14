package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/men/shirts/french-cuff-cotton-twill-oxford-471.html")
public class FrenchCuffCottonTwillOxfordPage extends PageObject {


    @FindBy(css = "[alt='White']")
    private WebElementFacade colorOfFrenchCuffTwillOxford;

    @FindBy(id = "swatch78" )
    private WebElementFacade sizeOfFrenchCuffTwillOxford;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    public void selectColorOfFrenchCuffTwillOxford() {
        clickOn(colorOfFrenchCuffTwillOxford);
    }

    public void selectSizeOfFrenchCuffTwillOxford() {
        clickOn(sizeOfFrenchCuffTwillOxford);
    }

    public void clickAddToCartFrenchCuffTwillOxford(){
        clickOn(addToCartButton);
    }
}

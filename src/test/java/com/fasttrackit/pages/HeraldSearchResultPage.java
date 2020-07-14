package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=HERALD+")
public class HeraldSearchResultPage extends PageObject {

    @FindBy(css = ".product-name [href*='herald']")
    private WebElementFacade heraldGlassVaseItemLink;

    public boolean verifyIfSearchGaveResult (){
        return heraldGlassVaseItemLink.containsOnlyText("HERALD GLASS VASE\n" +
                "110,00 RON");
    }


}

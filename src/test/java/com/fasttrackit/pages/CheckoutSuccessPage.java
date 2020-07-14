package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/success/")
public class CheckoutSuccessPage extends PageObject {

    @FindBy(css = ".sub-title")
    private WebElementFacade orderReceivedMessage;

    public boolean verifyOrderReceivedText(String receivedText){
        return orderReceivedMessage.containsOnlyText(receivedText);
    }


}

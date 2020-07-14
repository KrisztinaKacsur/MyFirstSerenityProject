package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {

    @FindBy(css = ".control:nth-child(4) [type='radio']")
    private WebElementFacade shipToThisAddressRadioButton;

    @FindBy(css = "#billing-buttons-container [title='Continue']")
    private WebElementFacade billingInfoContinueButton;

    @FindBy(css = "#shipping-buttons-container [title='Continue']")
    private WebElementFacade shippingInfoContinueButton;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInfoContinueButton;

    @FindBy(css = "[for='s_method_flatrate_flatrate']")
    private WebElementFacade flatRateRadioButton;

    @FindBy(css = ".btn-checkout")
    private WebElementFacade placeOrderButton;


    public void selectShipToThisAddressButton() {
        clickOn(shipToThisAddressRadioButton);
    }

    public void clickBillingInfoContinueButton() {
        clickOn(billingInfoContinueButton);
    }

    public void clickOnButtonShippingMetodContinueWithEWait() {
        withTimeoutOf(Duration.ofSeconds(10))
                .find(By.cssSelector("#shipping-method-buttons-container .button"))
                .click();
    }

    public void clickShippingInfoContinueButton() {
        clickOn(shippingInfoContinueButton);
    }


    public void clickPaymentInfoContinueButton() {
        clickOn(flatRateRadioButton);
        clickOn(paymentInfoContinueButton);
    }

    public void clickPlaceOrderButton() {
        clickOn(placeOrderButton);
    }








}

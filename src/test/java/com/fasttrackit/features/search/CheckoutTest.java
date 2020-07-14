package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void checkOutMenShirtTest() {
        checkoutSteps.proceedToCheckout();
        checkoutSteps.checkoutButton();
        checkoutSteps.clickShipToThisAddress();
        checkoutSteps.clickBillingInfo();
        checkoutSteps.clickShippingInfo();
        checkoutSteps.shippingButton();
        checkoutSteps.clickFlatRate();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyOrderReceivedMessage("THANK YOU FOR YOUR PURCHASE!");
    }


}

package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.*;
import org.junit.Assert;

public class CheckoutSteps {

    private HomePage homePage;
    private LogInPage logInPage;
    private MyDashboardPage myDashboardPage;
    private MenShirtsPage menShirtsPage;
    private FrenchCuffCottonTwillOxfordPage frenchCuffCottonTwillOxfordPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private CheckoutSuccessPage checkoutSuccessPage;

    public void proceedToCheckout(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogIn();
        logInPage.setUserEmailField("kricsk3@gmail.com");
        logInPage.setUserPasswordField("Madison");
        logInPage.clickLogInButton();
        myDashboardPage.hoverOverMenCategory();
        myDashboardPage.clickOnMenShirtLink();
        menShirtsPage.clickFrenchCuffCottonTwillOxford();
        frenchCuffCottonTwillOxfordPage.selectColorOfFrenchCuffTwillOxford();
        frenchCuffCottonTwillOxfordPage.selectSizeOfFrenchCuffTwillOxford();
        frenchCuffCottonTwillOxfordPage.clickAddToCartFrenchCuffTwillOxford();
    }


    public void checkoutButton () {
        cartPage.clickProceedToCheckoutButton();
    }

    public void clickShipToThisAddress(){
        checkoutPage.selectShipToThisAddressButton();

    }

    public void clickBillingInfo(){
        checkoutPage.clickBillingInfoContinueButton();
    }

    public void clickShippingInfo() {
        checkoutPage.clickShippingInfoContinueButton();
    }

    public void  shippingButton() {
        checkoutPage.clickOnButtonShippingMetodContinueWithEWait();
    }

    public void clickFlatRate() {
        checkoutPage.clickPaymentInfoContinueButton();
    }

    public void placeOrder() {
        checkoutPage.clickPlaceOrderButton();
    }

    public void verifyOrderReceivedMessage(String receivedText){
        Assert.assertTrue(checkoutSuccessPage.verifyOrderReceivedText(receivedText));
    }


}

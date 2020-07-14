package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.*;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {

    private LogInPage logInPage;
    private MyDashboardPage myDashboardPage;
    private MenShirtsPage menShirtsPage;
    private FrenchCuffCottonTwillOxfordPage frenchCuffCottonTwillOxfordPage;
    private CartPage cartPage;



    @Step
    public void navigateToMenShirtCategory (){
        myDashboardPage.hoverOverMenCategory();
        myDashboardPage.clickOnMenShirtLink();

    }
    @Step
    public void addSelectedMenShirtToCart(){
        menShirtsPage.clickFrenchCuffCottonTwillOxford();
        frenchCuffCottonTwillOxfordPage.selectColorOfFrenchCuffTwillOxford();
        frenchCuffCottonTwillOxfordPage.selectSizeOfFrenchCuffTwillOxford();
        frenchCuffCottonTwillOxfordPage.clickAddToCartFrenchCuffTwillOxford();
    }

    @Step
    public void navigateToAndAddShirtToCart (){
        navigateToMenShirtCategory();
        addSelectedMenShirtToCart();
    }


    @Step
    public void verifyAddedToCart() {
        cartPage.verifyAddedToCartText();
    }


    @Step
    public void removeMenShirtFromCart () {
        cartPage.clickRemoveProductFromCartButton();
    }

    @Step
    public void verifyEmptyCart () {
        cartPage.verifyEmptyCartText();
    }

    @Step
    public void updateProductQuantityInCart() {
        cartPage.updateQuantity("3");
        cartPage.clickUpdateButton();
    }

    @Step
    public void verifyPriceAfterQuantityUpdate (String price) {
        Assert.assertTrue(cartPage.verifyProductPrice(price));
    }





}

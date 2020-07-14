package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.LogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LogInSteps logInSteps;

    @Steps
    private CartSteps cartSteps;

    private String user = "kricsk3@gmail.com";
    private String pass = "Madison";

    @Test
    public void addToCartTest() {
        logInSteps.logIn(user, pass);
        cartSteps.navigateToMenShirtCategory();
        cartSteps.addSelectedMenShirtToCart();
        cartSteps.verifyAddedToCart();
    }

    @Test
    public void removeOnlyProductFromCartTest (){
        logInSteps.logIn(user,pass);
        cartSteps.navigateToAndAddShirtToCart();
        cartSteps.removeMenShirtFromCart();
        cartSteps.verifyEmptyCart();
    }

    @Test
    public void changeQuantityInCart () {
        logInSteps.logIn(user, pass);
        cartSteps.navigateToAndAddShirtToCart();
        cartSteps.updateProductQuantityInCart();
        cartSteps.verifyPriceAfterQuantityUpdate("570,00 RON");

    }

}

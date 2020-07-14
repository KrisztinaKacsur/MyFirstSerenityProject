package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade productAddedToCartMessage;

    @FindBy(css = ".a-center .btn-remove2")
    private WebElementFacade removeButton;

    @FindBy(css = ".page-title")
    private WebElementFacade emptyCartText;

    @FindBy (css = "[title='Qty']")
    private WebElementFacade quantityTextBox;

    @FindBy (css = ".product-cart-actions [value='update_qty']")
    private WebElementFacade updateButton;

    @FindBy(css = ".product-cart-total .price")
    private WebElementFacade shoppingCartSubtotalText;

    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom .btn-checkout")
    private WebElementFacade proceedToCheckoutButton;

    public boolean verifyAddedToCartText (){
        return productAddedToCartMessage.containsOnlyText("French Cuff Cotton Twill Oxford was added to your shopping cart.");
    }


    public void clickRemoveProductFromCartButton () {
        clickOn(removeButton);
    }

    public boolean verifyEmptyCartText() {
        return emptyCartText.containsOnlyText("SHOPPING CART IS EMPTY");
    }


    public void updateQuantity(String newQuantity) {
        typeInto(quantityTextBox, newQuantity );
    }

    public void clickUpdateButton () {
        clickOn(updateButton);
    }

    public boolean verifyProductPrice(String priceText) {
        return shoppingCartSubtotalText.containsOnlyText(priceText);
    }

    public void clickProceedToCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }



}

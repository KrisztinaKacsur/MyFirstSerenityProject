package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LogInPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade userEmailField;

    @FindBy(id = "pass")
    private WebElementFacade userPasswordField;

    @FindBy(id = "send2")
    private WebElementFacade logInButton;

    public void setUserEmailField(String email) {
        typeInto(userEmailField, email);
    }

    public void setUserPasswordField(String pass) {
        typeInto(userPasswordField, pass);
    }

    public void clickLogInButton() {
        clickOn(logInButton);
    }

    public boolean isOnLogInPage () {
       return userEmailField.isDisplayed();
    }







}

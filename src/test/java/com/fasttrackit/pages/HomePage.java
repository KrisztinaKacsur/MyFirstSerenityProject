package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {


    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy (css = "button[title='Search']")
    private WebElementFacade searchButton;


    public void clickAccount (){
        clickOn(accountLink);
    }

    public void clickLogIn() {
        clickOn(logInLink);
    }

    public void searchForProduct() {
        clickOn(searchField);
        typeInto(searchField, "herald");
    }

    public void clickOnSearchButton (){
        clickOn(searchButton);
    }






}

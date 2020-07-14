package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class MyDashboardPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeText;

    @FindBy(css = ".nav-2 .has-children")
    private WebElementFacade menCategoryLink;

    @FindBy(css = ".nav-2 [href*='shirt']")
    private WebElementFacade menShirtLink;



    public boolean verifyLogInText(String userName){
        return welcomeText.containsOnlyText("Hello, " + userName + "!");
    }

    public void hoverOverMenCategory () {
        Actions action = new Actions(getDriver());
        Actions hoverOverLocationSelector = action.moveToElement(menCategoryLink);
        hoverOverLocationSelector.perform();

    }

    public void clickOnMenShirtLink() {
        clickOn(menShirtLink);
    }



}

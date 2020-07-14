package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LogInPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LogInSteps {

    private HomePage homePage;
    private LogInPage logInPage;
    private MyDashboardPage myDashboardPage;

    @Step
    public void navigateToLogInPage () {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogIn();
    }

    @Step
    public void logInWithCredentials (String email, String pass) {
        logInPage.setUserEmailField(email);
        logInPage.setUserPasswordField(pass);
        logInPage.clickLogInButton();
    }

    @Step
    public void verifyLoggedIn(String userName){
        Assert.assertTrue(myDashboardPage.verifyLogInText(userName));
    }

    @Step
    public void logIn(String email, String pass) {
        navigateToLogInPage();
        logInWithCredentials(email, pass);

    }

    @Step
    public void verifyNotLoggedIn () {
       Assert.assertTrue(logInPage.isOnLogInPage());
    }


}

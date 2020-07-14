package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.LogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogInTest {

    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LogInSteps logInSteps;

    private String user = "kricsk3@gmail.com";
    private String pass = "Madison";

    @Test
    public void validLogInTest() {
        logInSteps.navigateToLogInPage();
        logInSteps.logInWithCredentials(user, pass);
        logInSteps.verifyLoggedIn("Krisztina K Kacsur");
    }

    @Test
    public void invalidUserEmailTest() {
        logInSteps.navigateToLogInPage();
        logInSteps.logInWithCredentials("kicsk@gmail.com" , pass);
        logInSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassTest() {
        logInSteps.navigateToLogInPage();
        logInSteps.logInWithCredentials(user, "Madisoooon");
        logInSteps.verifyNotLoggedIn();
    }



}

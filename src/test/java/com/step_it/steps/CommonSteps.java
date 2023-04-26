package com.step_it.steps;

import com.step_it.pages.LoginPage;
import com.step_it.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Slf4j
@AllArgsConstructor
public class CommonSteps {

    private LoginPage loginPage;
    private MainPage mainPage;

    public void checkLoginPageIsOpen() {
        log.info("Check login page is open");
        assertThat(loginPage.isLogoDisplayed()).as("The login page is not displayed").isTrue();
    }

    public void checkUserLoggedIn() {
        log.info("Check user is logged in");
        assertThat(mainPage.isTitleDisplayed()).as("The title is not displayed").isTrue();
    }
}

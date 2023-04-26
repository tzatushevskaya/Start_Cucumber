package com.step_it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends  BasePage{

    @FindBy(css = ".header_secondary_container")
    private WebElement pageTitle;

    @FindBy(css ="#react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(css ="#logout_sidebar_link")
    private WebElement logoutBtn;

    public boolean isTitleDisplayed(){
        return pageTitle.isDisplayed();
    }

    public void logout() {
        menuBtn.click();
        logoutBtn.click();
    }
}

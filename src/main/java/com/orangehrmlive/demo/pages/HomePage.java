package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //store orangehrm logo,admin,pim,leave,dashboard,welcome text,locators
    @CacheLookup
    @FindBy(name = "username")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement hrmLogo;

    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;


    public void setEnterUserName(String userName) {
        sendTextToElement(enterUserName, userName);
    }

    public void setEnterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    public String setVerifyLoginPanel() {
        return getTextFromElement(verifyLoginPanel);
    }

    public void setHrmLogo() {
        driver.findElement((By) hrmLogo).isDisplayed();

    }
}


package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {
    By usernameTextField = By.xpath("//input[@placeholder='Username']");
    By passwordTextField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.cssSelector("button[type='submit']");
    WebElement hrForAllLogo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']"));
    WebElement loginPanelText = driver.findElement(By.xpath("//h5[normalize-space()='Login']"));

    public void loginToApplication(){
        sendTextToElement(usernameTextField,"Admin");
        sendTextToElement(passwordTextField,"admin123");
        clickOnElement(loginButton);
    }

    public boolean verifyOrangeHRMLogoIsDisplayed(){
        return isElementDisplayed(hrForAllLogo);
    }

    public boolean verifyLoginPanelTextIsDisplayed(){
        return isElementDisplayed(loginPanelText);
    }
}

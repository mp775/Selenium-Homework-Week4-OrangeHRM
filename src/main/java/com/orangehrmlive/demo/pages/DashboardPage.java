package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
    By profileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/img");
    By logoutLink = By.xpath("//a[contains(text(),'Logout')]");

    public String verifyDashboardTextIsDisplayed(){
        return getTextFromElement(dashboardText);
    }

    public void clickOnProfileLogo(){
        clickOnElement(profileLogo);
    }

    public void clickOnLogoutLink(){
        mouseHoverToElementAndClick(logoutLink);

    }


}

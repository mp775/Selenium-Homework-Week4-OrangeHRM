package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By searchTextField = By.xpath("//input[@placeholder='Search']");
    By adminTab = By.xpath("//span[normalize-space()='Admin']");
    By pimTab = By.xpath("//span[normalize-space()='PIM']");
    By leaveTab = By.xpath("//span[normalize-space()='Leave']");
    By dashboardTab = By.xpath("//span[normalize-space()='Dashboard']");

    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
}

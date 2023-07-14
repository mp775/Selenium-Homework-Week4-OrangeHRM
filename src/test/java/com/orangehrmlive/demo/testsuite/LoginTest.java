package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.loginToApplication();
        String expectedDashboardText = "Dashboard";
        String actualDashboardText = dashboardPage.verifyDashboardTextIsDisplayed();
        Assert.assertEquals(actualDashboardText,expectedDashboardText,"Presence of Dashboard Text Validation Failed");
    }

    @Test
    public void verifyThatTheLogoDisplayOnLoginPage(){
        Assert.assertTrue(loginPage.verifyOrangeHRMLogoIsDisplayed(),"HR for ALL Logo is not displayed");
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        loginPage.loginToApplication();
        dashboardPage.clickOnProfileLogo();
        dashboardPage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.verifyLoginPanelTextIsDisplayed(),"Login Panel Text is not displayed");
    }
}

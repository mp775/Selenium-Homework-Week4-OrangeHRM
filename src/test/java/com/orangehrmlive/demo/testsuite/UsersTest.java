package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    LoginPage loginPage = new LoginPage();
    String expectedSystemUsersWebEleText;
    String username = "Het123";

    @Test
    public void adminShouldAddUserSuccessfully() throws InterruptedException {
        loginPage.loginToApplication();
        homePage.clickOnAdminTab();
        expectedSystemUsersWebEleText = "System Users";
        String actualSystemUsersWebEleText = viewSystemUsersPage.verifySystemUsersTextIsDisplayed();
        Assert.assertEquals(actualSystemUsersWebEleText,expectedSystemUsersWebEleText,"System Users Text is not displayed");
        viewSystemUsersPage.clickOnAddButton();
        String expectedAddUserText = "Add User";
        String actualAddUserTextFromWebEle = addUserPage.verifyAddUserTextIsDisplayed();
        Assert.assertEquals(actualAddUserTextFromWebEle,expectedAddUserText,"Add User Text is not displayed");
        Thread.sleep(3000);
        addUserPage.selectUserRoleAdmin();
        Thread.sleep(2000);
        addUserPage.enterEmployeeName();
        addUserPage.enterUsername();
        addUserPage.selectStatusDisabled();
        addUserPage.enterPassword();
        addUserPage.enterConfirmPassword();
        addUserPage.clickOnSaveButton();
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.loginToApplication();
        homePage.clickOnAdminTab();
        String actualSystemUsersWebEleText = viewSystemUsersPage.verifySystemUsersTextIsDisplayed();
        Assert.assertEquals(actualSystemUsersWebEleText,expectedSystemUsersWebEleText,"System Users Text Validation Failed");
        viewSystemUsersPage.enterUsername(username);
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();
        String actualUserNameTextFromWebElement = viewSystemUsersPage.verifyUsernameTextIsPresentInSearchList(username);
        Assert.assertEquals(actualUserNameTextFromWebElement, username,"Username is not displayed in search result list");
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginPage.loginToApplication();
        homePage.clickOnAdminTab();
        String actualSystemUsersWebEleText = viewSystemUsersPage.verifySystemUsersTextIsDisplayed();
        Assert.assertEquals(actualSystemUsersWebEleText,expectedSystemUsersWebEleText,"System Users Text Validation Failed");
        viewSystemUsersPage.enterUsername(username);
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();
        String actualUserNameTextFromWebElement = viewSystemUsersPage.verifyUsernameTextIsPresentInSearchList(username);
        Assert.assertEquals(actualUserNameTextFromWebElement, username,"Username is not displayed in search result list");
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDeleteButtonToDeleteUser();
        Thread.sleep(3000);
        acceptAlert();
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.loginToApplication();
        homePage.clickOnAdminTab();
        String actualSystemUsersWebEleText = viewSystemUsersPage.verifySystemUsersTextIsDisplayed();
        Assert.assertEquals(actualSystemUsersWebEleText,expectedSystemUsersWebEleText,"System Users Text Validation Failed");
        viewSystemUsersPage.enterUsername(username);
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();
        String expectedTextNoRecordFound = "No Records Found";
        String actualTextNoRecordFound = viewSystemUsersPage.verifyNoRecordFoundTextIsDisplayed();
        Assert.assertEquals(actualTextNoRecordFound,expectedTextNoRecordFound,"No Record Found Text Validation Failed");
    }
}

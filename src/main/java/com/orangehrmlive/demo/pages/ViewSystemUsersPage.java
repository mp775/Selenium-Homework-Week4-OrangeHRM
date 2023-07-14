package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By userNameTextField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRoleDropdown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropdown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By resetBtn = By.xpath("//button[normalize-space()='Reset']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By checkBoxWebEle = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton = By.xpath("//button[normalize-space()='Delete Selected']");
    By yesDeletePopupBtn = By.xpath("//button[normalize-space()='Yes, Delete']");
    By noRecordFoundText = By.xpath("//span[normalize-space()='No Records Found']");

    public String verifySystemUsersTextIsDisplayed(){
        return getTextFromElement(systemUsersText);
    }

    public void clickOnAddButton(){
        clickOnElement(addBtn);
    }

    public void enterUsername(String username){
        sendTextToElement(userNameTextField,username);
    }

    public void selectUserRole(){
        selectByVisibleTextFromDropDown(userRoleDropdown,"ESS");
    }

    public void selectStatus(){
        selectByVisibleTextFromDropDown(statusDropdown,"Enabled");
    }

    public void clickOnSearchButton(){
        clickOnElement(searchBtn);
    }

    public String verifyUsernameTextIsPresentInSearchList(String username){
        return driver.findElement(By.xpath("//div[contains(text(),'"+username+"')]")).getText();
    }

    public void clickOnCheckBox(){
        clickOnElement(checkBoxWebEle);
    }

    public void clickOnDeleteButtonToDeleteUser(){
       clickOnElement(deleteButton);
    }

    public String verifyNoRecordFoundTextIsDisplayed(){
        return getTextFromElement(noRecordFoundText);
    }
}

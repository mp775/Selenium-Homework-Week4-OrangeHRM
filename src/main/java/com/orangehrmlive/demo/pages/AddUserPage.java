package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddUserPage extends Utility {
    By addUserTextWebEle = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropdownWebEle = By.xpath("//div[contains(text(),'-- Select --')][1]");
    By adminOption = By.xpath("//div[contains(text(),'Admin')]");
    By userNameWebEle = By.xpath("//input[@class='oxd-input oxd-input--focus']");
    By statusDropdownWebEle = By.xpath("//div[contains(text(),'-- Select --')][2]");
    By disabledOption = By.xpath("//div[contains(text(),'Admin')]");
    By passwordFieldWebEle = By.xpath("//input[@type='password']");
    By confirmPasswordFieldWebEle = By.xpath("//input[@type='password']");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    WebElement employeeNameWebEle = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));

    public String verifyAddUserTextIsDisplayed(){
        return getTextFromElement(addUserTextWebEle);
    }

    public void selectUserRoleAdmin(){
        clickOnElement(userRoleDropdownWebEle);
        mouseHoverToElementAndClick(adminOption);
    }

    public void enterEmployeeName(){
        Actions actions = new Actions(driver);
        actions.moveToElement(employeeNameWebEle).sendKeys("Lisa").keyDown(employeeNameWebEle, Keys.SHIFT).click();
    }

    public void enterUsername(){
        sendTextToElement(userNameWebEle,"Admin");
    }

    public void selectStatusDisabled(){
        clickOnElement(statusDropdownWebEle);
        mouseHoverToElementAndClick(disabledOption);
    }

    public void enterPassword(){
        sendTextToElement(passwordFieldWebEle,"admin123");
    }

    public void enterConfirmPassword(){
        sendTextToElement(confirmPasswordFieldWebEle,"admin123");
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
}

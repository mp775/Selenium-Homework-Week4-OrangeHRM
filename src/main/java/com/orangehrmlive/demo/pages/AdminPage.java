package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By userManagementTab = By.xpath("//span[normalize-space()='User Management']");
    By jobTab = By.xpath("//span[normalize-space()='Job']");
    By organizationTab = By.xpath("//span[normalize-space()='Organization']");
    By usersTabLink = By.xpath("//a[normalize-space()='Users']");
    By jobTitlesLink = By.xpath("//a[normalize-space()='Job Titles']");
    By payGradesLink = By.xpath("//a[normalize-space()='Pay Grades']");
    By employmentStatusLink = By.xpath("//a[normalize-space()='Employment Status']");
    By jobCategoriesLink = By.xpath("//a[normalize-space()='Job Categories']");
    By workShiftsLink = By.xpath("//a[normalize-space()='Work Shifts']");
    By generalInformationLink = By.xpath("//a[normalize-space()='General Information']");
    By locationLink = By.xpath("//a[normalize-space()='Locations']");
    By structureLink = By.xpath("//a[normalize-space()='Structure']");

}

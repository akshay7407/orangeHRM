package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.Util.ActionsClassMethods;

public class AdminPage extends BaseClass {

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement AddNewuser;

	@FindBy(xpath = "//*[text()='User Management']")
	WebElement employeeName;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement adminMgt;

	@FindBy(xpath = "//*[text()='Users']")
	WebElement user;

	@FindBy(id = "btnAdd")
	WebElement AddButton;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement empname;

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	public void CreateUsers() {

		ActionsClassMethods.MouseOverOnElement(AddNewuser);
		ActionsClassMethods.MouseOverOnElement(adminMgt);

		user.click();
	}

	public void enterEmpName(String name) {
		AddButton.click();
		empname.sendKeys(name);
	}

}

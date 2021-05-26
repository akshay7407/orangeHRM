package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

import com.Util.*;

public class loginPage extends BaseClass {

	// POM with page story

	@FindBy(name = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	// assiociated methods
	public void loginFunctionality(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);

		JavaScriptMethods.ClickonElementUsingJS(loginButton);

	}

}

package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement Logo;

	@FindBy(xpath = "//b[text()='Admin']")
	WebElement adminButton;

	@FindBy(xpath = "//b[text()='PIM']")
	WebElement PIMButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyLogo() {
		Boolean logoStatus = Logo.isDisplayed();
		return logoStatus;
	}

	public String verifyTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public AdminPage ClickonAdmin() {

		adminButton.click();

		return new AdminPage();

	}

}

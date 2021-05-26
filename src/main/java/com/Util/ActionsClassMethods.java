package com.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass {
	public static Actions act;

	public static void MouseOverOnElement(WebElement wb) {

		act = new Actions(driver);
		act.moveToElement(wb).build().perform();

	}

	public static void DoubleClickOnElement(WebElement wb) {
		act = new Actions(driver);
		act.doubleClick(wb).build().perform();
	}

	public static void RightClickOnElement(WebElement wb) {
		act = new Actions(driver);
		act.contextClick(wb).build().perform();
	}

	// drag and drop 
	public static void RightClickOnElement(WebElement source , WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}
	
	//click and hold
	
	//click method
	
	
	
}

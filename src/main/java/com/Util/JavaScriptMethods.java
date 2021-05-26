package com.Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JavaScriptMethods extends BaseClass {

	//click on Element using Java script executor
	public static void ClickonElementUsingJS(WebElement wb) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb);
	}

	//send text in text box using java script executor
	
	
	
	
	// move end of page using java script
	
	
	//other java script methods
	
	
}

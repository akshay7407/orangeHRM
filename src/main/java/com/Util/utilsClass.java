package com.Util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class utilsClass extends BaseClass {

	//Handle Drop down
	
	public static void HandleDropDown(WebElement wb, String text) {
		
		Select sel=new Select(wb);
		sel.selectByVisibleText(text);
	}
	
	public static int CountDropDownIteams(WebElement wb, String text) {
		
		Select sel=new Select(wb);
		sel.selectByVisibleText(text);
		List<WebElement> ls =sel.getOptions();
		int dpCount=ls.size();
		return dpCount;
	}
	
	// Take Screen Shot
	public static void TakeScreenShot() {
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String dist=System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(f, new File(dist +"/ScreenShot/"+System.currentTimeMillis() +".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	// explict wait
	
	public static void explicitwait(By wb) {
		
		WebDriverWait wait=new WebDriverWait(driver, 40);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(wb));
		
	}
	
	//ParentFrame
	public static void MainFrame(WebElement wb) {
		driver.switchTo().frame(wb);
	}
	
	//child Frame
	
	public static void ChildFrame(WebElement wb) {
		driver.switchTo().frame(wb);
	}
	
	// Switch to top frame
	public static void switchTotopFrame() {
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
}

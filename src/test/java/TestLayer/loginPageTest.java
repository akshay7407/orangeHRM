package TestLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.loginPage;


public class loginPageTest extends BaseClass{

	
	@Test
	public void loginFunctionality() {
	
		initialization();
		
		loginPage obj=new loginPage();
		
		obj.loginFunctionality(prop.getProperty("username1"), prop.getProperty("password1"));
		
	}

}

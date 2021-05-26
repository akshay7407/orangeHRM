package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AdminPage;
import com.PageLayer.HomePage;
import com.PageLayer.loginPage;

public class AdminPageTest extends BaseClass{;
	loginPage loginpage;
	HomePage homepage;
	AdminPage adminpage;
	
	
	@BeforeClass
	public void setup() {
		
		BaseClass.initialization();
		loginpage = new loginPage();
		loginpage.loginFunctionality("Admin", "admin123");
		homepage = new HomePage();
		
		 adminpage=new AdminPage();
			
	}
	
	@Test
	public void AdminVerify() throws InterruptedException {
		
		Thread.sleep(4000);
		adminpage.CreateUsers();
		
	}
	
	@Test
	public void addNewuser() throws InterruptedException {
		
		Thread.sleep(4000);
	
		
		adminpage.enterEmpName("Amit pandit");
	
	}
	
	
	
	
	
	

}

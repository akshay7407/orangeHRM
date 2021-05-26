package TestLayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.loginPage;

public class HomePageTest extends BaseClass {
	loginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new loginPage();
		loginpage.loginFunctionality("Admin", "admin123");
		homepage = new HomePage();
	}

	@Test(priority=1)
	public void verifyHomepage() {

		Boolean actualLogo = homepage.verifyLogo();
		Assert.assertSame(actualLogo, true);

	}

	@Test(priority=2)
	public void verifytitle() {

		String actualTile = homepage.verifyTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTile, expectedTitle);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

package com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Util.WebEventListener;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener listner;
	public static EventFiringWebDriver EventDriver;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\L470_1\\Desktop\\2703221\\script\\com.OrangeHRM\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public static void initialization() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\L470_1\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\L470_1\\Desktop\\2703221\\script\\com.OrangeHRM\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else if (browsername.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\L470_1\\Desktop\\2703221\\script\\com.OrangeHRM\\drivers\\operadriver.exe");
			driver = new OperaDriver();

		}

		listner =new WebEventListener();
		
		EventDriver=new EventFiringWebDriver(driver);
		//we have registred Customer class in util package..--- Web Event Listener
		EventDriver.register(listner);
		driver=EventDriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}

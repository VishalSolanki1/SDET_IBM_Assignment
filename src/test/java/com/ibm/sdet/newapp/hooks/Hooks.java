package com.ibm.sdet.newapp.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

	public static WebDriver setUpDriver(String driver) {

		WebDriver dr = null;

		if(driver.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe"); 
			dr = new FirefoxDriver();
			System.out.println("Driver successfully setup");
		} 

		else if(driver.equalsIgnoreCase("chrome")) { 
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			dr = new ChromeDriver();
			System.out.println("Driver successfully setup");
		}

		else {
			System.out.println("Please provide valid name of driver - eg: firefox, chrome etc");
		}

		return dr;
	}

	public static void closeBrowser(WebDriver driver) {
		
		driver.close();
		
		System.out.println("Closed current window");
	}
}

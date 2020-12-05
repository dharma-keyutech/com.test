package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASE_Class {

	public static WebDriver driver;

	

	public static void launchBrowser(String Url) {
		try {
			// Setting the webdriver.chrome.driver property to its executable's
			// location
			
	// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
            	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");

		         driver = new ChromeDriver();

                 driver.navigate().to(Url);
            	
               	} catch (Exception e) {
			System.out.println("Failed to launch Browser.");
		}
		}


	}

	


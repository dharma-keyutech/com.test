package com.testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.base.BASE_Class;

public class open_Chrome extends BASE_Class {
	

	// static String Url="https://www.google.com/";
	@org.testng.annotations.Test
	public static void  Test() {
		
		WebDriverManager.chromedriver().setup();
	       ChromeOptions options=new ChromeOptions();
               options.addArguments("headless");
	          driver=new ChromeDriver(options);
          
		driver.navigate().to("https://www.google.com/");

		// launchBrowser("https://mail.google.com/mail/u/0/#inbox");
       // driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		
		
		
	}
	
	}



package com.testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.base.BASE_Class;

public class open_Chrome extends BASE_Class {
	
          	public static WebDriver driver;

	// static String Url="https://www.google.com/";
	@org.testng.annotations.Test
	public static void  Test() {
		
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/ geckodriver");
		
		// WebDriverManager.chromedriver().setup();
	     //  ChromeOptions options=new ChromeOptions();
              // options.addArguments("headless");
	         // driver=new ChromeDriver(options);
		
		driver = new ChromeDriver();
                driver.get("http://www.google.com");

		//driver.navigate().to("https://www.google.com/");

		// launchBrowser("https://mail.google.com/mail/u/0/#inbox");
       // driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		
		
		
	}
	
	}



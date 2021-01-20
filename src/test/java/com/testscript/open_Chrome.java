package com.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import com.base.BASE_Class;

public class open_Chrome extends BASE_Class {
	

//	// static String Url="https://www.google.com/";
//	@org.testng.annotations.Test
//	public static void  Test() {
//
//		launchBrowser("https://mail.google.com/mail/u/0/#inbox");
//       // driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//		
//		String Tittle= driver.getTitle();
//		
//		System.out.println(Tittle);
//		
//		
//		String Source =driver.getPageSource();
//		// System.out.println(Source);
//		
	public static WebDriver driver;
	static String Url="https://www.google.com/";
	static String exePATH= System.getProperty("user.dir")+"/drivers/geckodriver";
	@Test
	public static void  test() throws Throwable    {
		//Process pr = rt.exec("sudo chmod 777 > exePATH\"");

   // System.setProperty("webdriver.gecko.driver",exePATH);
		//System.setProperty("webdriver.chrome.driver",exePATH);
		System.setProperty("webdriver.gecko.driver",exePATH);
    //driver = new ChromeDriver();
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		
    driver=new FirefoxDriver(options);
	driver.get(Url);

		
		
	}

	
	
	}



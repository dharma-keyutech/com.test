package com.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	static String exePATH= System.getProperty("user.dir")+"/drivers/chromedriver";
	@Test
	public static void  test() throws IOException {
		Process process = Runtime.getRuntime().exec(
		        "chmod 777 exePATH");
    System.setProperty("webdriver.chrome.driver",exePATH);
    driver = new ChromeDriver();
	driver.get(Url);
		
		
	}

	
	}



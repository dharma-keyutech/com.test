package com.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.base.BASE_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_Browser extends BASE_Class {
	

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
		
    //driver = new ChromeDriver();
//	FirefoxOptions options=new FirefoxOptions();
//	options.addArguments("--headless");
		
//		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//		System.out.println("Debug 2");
//		capabilities.setCapability("marionette", true);
//		System.out.println("Debug 3");
//		WebDriver driver = new FirefoxDriver(capabilities);
//	WebDriver drive= new FirefoxDriver(options);
//		System.out.println("Debug 4");
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();  
//		driver.quit();

	// Chrome Head less
//WebDriverManager.chromedriver().setup();
//ChromeOptions options=new ChromeOptions();
//options.addArguments("--headless");
//options.setBinary("/usr/bin/google-chrome-stable /usr/share/man/man1/google-chrome-stable.1.gz");
//driver = new ChromeDriver(options);
//driver.get("http://www.google.com");
//driver.manage().window().maximize();  
//driver.quit();

// Firefox headless
//System.setProperty("webdriver.gecko.driver",exePATH);
WebDriverManager.firefoxdriver().setup();
FirefoxOptions options2=new FirefoxOptions();
System.out.println("Debug 1  at settingt options for Firefox driver");
options2.addArguments("--headless");
System.out.println("Debug 2 at setting Headless as a option for Firefox driver");	
driver = new FirefoxDriver(options2);
//driver = new FirefoxDriver();
System.out.println("Debug 3 at launching Firefox using geckodriver with help of options");
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(2000); // millisec
System.out.println("Debug 4 at waiting statement");
driver.get("http://www.google.com");
System.out.println("Debug 5 at pass URL");
driver.manage().window().maximize();  
System.out.println("Debug 6 at maximize browser ");
driver.quit();	
System.out.println("Debug 7 at Browser Quit");


		
	}

	
	
	}




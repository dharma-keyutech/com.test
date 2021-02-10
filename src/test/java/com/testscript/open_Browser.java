package com.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.base.BASE_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_Browser {
	

	public static WebDriver driver;
	
	@Test
	public static void  test() throws Throwable    {
		
// Firefox headless

 //WebDriverManager.firefoxdriver().setup();
// FirefoxOptions options2=new FirefoxOptions();
		// Chrome headless
WebDriverManager.chromedriver().setup();
ChromeOptions options2=new ChromeOptions();
System.out.println("Debug 1  at settingt options for Firefox driver");
options2.addArguments("--headless");
//options2.addArguments("--disable-gpu");
//options2.addArguments("--no-sandbox");
System.out.println("Debug 2 at setting Headless as a option ");	
driver = new FirefoxDriver(options2);
System.out.println("Debug 3 at launching Browser with help of options");
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(50000); // millisec
System.out.println("Debug 4 at waiting statement");
driver.get("http://www.google.com");
System.out.println("Debug 5 at pass URL");
driver.manage().window().maximize();  
System.out.println("Debug 6 at maximize browser ");
driver.quit();	
System.out.println("Debug 7 at Browser Quit");
	
	}

	
	}

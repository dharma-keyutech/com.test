package com.base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASE_Class {

	private static final String tmpPath = null;
	public static WebDriver driver;

	

	public static void launchBrowser(String Url) {
		try {
			// Setting the webdriver.chrome.driver property to its executable's
			// location
			
	// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
            	
			// creating a new file instance 

		        File file = new File (System.getProperty("user.dir")+"/drivers/chromedriver");

		          System.out.println(file);

		        // check if file exists 

		        boolean exists = file.exists(); 

		        if(exists == true) 

		        { 

		            // changing the file permissions 

		            file.setExecutable(true); 

		            file.setReadable(true); 

		            file.setWritable(false); 

		            System.out.println("File permissions changed."); 

		  
		            // printing the permissions associated with the file currently 

		            System.out.println("Executable: " + file.canExecute()); 

		            System.out.println("Readable: " + file.canRead()); 

		            System.out.println("Writable: "+ file.canWrite()); 
		      
			
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
		
		           System.setProperty("webdriver.chrome.driver","file");
		            
		       WebDriverManager.chromedriver().setup();
	WebDriverManager.chromedriver().browserVersion("87.0.4280.88");
		//	driver = new ChromeDriver();
		      // ChromeOptions options=new ChromeOptions();
		       // options.addArguments("headless");
		      // driver=new ChromeDriver(options);
		       
// WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65530).build());
   
		     //  WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65530).build());
		       ChromeOptions options=new ChromeOptions();
               options.addArguments("headless");
	          driver=new ChromeDriver(options);
          
  		 //WebDriverManager.firefoxdriver().setup();
			 //driver = new FirefoxDriver();
			

                 driver.navigate().to(Url);
                 
                 Thread.sleep(300);
		        }   
            	
               	} catch (Exception e) {
			System.out.println("Failed to launch Browser.");
			
			System.out.println(e);
		}
	
	}
}



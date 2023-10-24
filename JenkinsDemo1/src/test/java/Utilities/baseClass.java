package Utilities;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class baseClass {
	WebDriver driver;
	
  @Parameters({"browser","website"})
  @BeforeMethod
	  public void IBrowsers(String NameOfBrowser, String url ) {
			
			if (NameOfBrowser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();	
			//System.setProperty("webdriver.chrome.driver","C:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			//log.info("Browser Initialized and went to URL" + url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);}
			//log.info("window meximized");}
			
			else if (NameOfBrowser.equalsIgnoreCase("Edge")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.edge.driver", ud+ "\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get(url);
			//log.info("Browser Initialized and went to URL" + url);
			driver.manage().window().maximize();}}
	  
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

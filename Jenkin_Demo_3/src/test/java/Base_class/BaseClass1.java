package Base_class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class BaseClass1 {
	WebDriver driver;
 
	
	
	
	
  @Parameters({"browser","website"})
  @BeforeMethod
  public void ibrowser(String mainofbrowser,String url) {
		//String ud = System.getProperty("user.dir");
		if(mainofbrowser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();}
		
		else if(mainofbrowser.equalsIgnoreCase("edge")){
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);}}


  
  
  
  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}

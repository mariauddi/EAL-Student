package com.train.org.mari.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Maria {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		ibrowser("chrome");
		screenshorts();
		
	}

	public static void ibrowser(String mainbrowser) {
		if(mainbrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
	}
	
	public static void screenshorts() throws IOException {
		Date ob = new Date();
		String allfile = ob.toString().replace(" ","_").replace(":", "_");
		System.out.println(allfile);
		System.out.println(ob);
		File afile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy( afile,new File( "C:\\Users\\muddi\\OneDrive\\Documents\\po\\mari.selenium\\Pictures\\"+allfile+"home.jpg"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	


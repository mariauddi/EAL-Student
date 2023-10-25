package com.train.org.mari.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ibrowser {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		ibrowser("chrome");
		Thread.sleep(2000);
		screenshorts();
		
		

	}
	public static void ibrowser(String main) {
		
		if(main.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\muddi\\OneDrive\\Documents\\po\\mari.selenium\\Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			
		}
	}
	
	
	public static void screenshorts() throws IOException {
		Date pictu = new Date();
		
		String dfile = pictu.toString().replace(" ","_").replace(":","_");
		System.out.println(dfile);
		System.out.println(pictu);
		File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(pic, new File("C:\\Users\\muddi\\OneDrive\\Documents\\po\\mari.selenium\\Pictures\\"+dfile+"home.jpg"));
		
		
	}
	
	
}

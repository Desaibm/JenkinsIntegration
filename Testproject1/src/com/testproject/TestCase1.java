package com.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	
	@Test
	
	public void myntra() {
		
		
		driver.get("https://www.myntra.com");
		driver.getTitle();
			
	}
	
	@BeforeMethod
	public void browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		
	}
	
	@AfterMethod
	public void closewindow() throws Exception {
		
		Thread.sleep(6000);
		driver.close();
	}
	
	@Test
	public void shopclues() {
		
		driver.get("https://www.shopclues.com");
		driver.getTitle();
	}

}

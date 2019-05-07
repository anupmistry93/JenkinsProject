package com.qa.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cart {
	 WebDriver driver;
	
	@Test
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//hkke
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

}
}

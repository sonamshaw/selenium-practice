package com.automationFramework.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class FlipkartAutomationScript {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/swapan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Utility.captureScreenShot(driver, "Flipkart home page");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Dell");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Utility.captureScreenShot(driver, "Search result page");
		driver.quit();
		
	}
}

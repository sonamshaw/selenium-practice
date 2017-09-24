package com.automationFramework.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class MakemyTripAutomation {
	public static void main(String[]args) throws IOException{
		System.setProperty("webdriver.gecko.driver", "/home/swapan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Utility.captureScreenShot(driver, "makeMytrip Home Page");
		driver.findElement(By.id("header_tab_hotels")).click();
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//*[@id='js-hotelName-0' and @title[starts-with(.,'Resort Rio')] ]")).click();
		driver.quit();
	}
}

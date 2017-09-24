package com.automationFramework.java;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class FirstTestClass {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/swapan/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.travelyaari.com/");
		System.out.println(driver.getTitle());
		WebElement origin= driver.findElement(By.id("from-city"));
		origin.sendKeys("Mumbai");
		origin.sendKeys(Keys.ENTER);
		WebElement destination= driver.findElement(By.id("to-city"));
		destination.sendKeys("Hyderabad");
		destination.sendKeys(Keys.ENTER);
		// implicit wait will check only presence/visibility of element
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.MICROSECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextDate")));
		WebElement date=driver.findElement(By.id("nextDate"));
		date.click();
		WebElement submit=driver.findElement(By.className("ty-button-orange"));
		submit.click();
		
		
		
	}

}

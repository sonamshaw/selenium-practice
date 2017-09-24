package com.automationFramework.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksCount {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/swapan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println("total links count is" + count);
		int k = allLinks.size();
		for (int i = 0; i < k; i++) {
			if (allLinks.get(i).getAttribute("href").contains("google")) {
				String link = allLinks.get(i).getAttribute("href");
				System.out.println(link);
			}
		}
	}
}

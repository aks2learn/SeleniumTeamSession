package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
	       // driver.get("https://dev.culturebie.com/");
	       // driver.close();
	      // Thread.sleep(1000);
	       driver.navigate().to("https://dev.culturebie.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.name("username"));
	       
	       
	       
	}
	
}

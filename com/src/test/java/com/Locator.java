package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//Set Driver

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.id("inputUsername"));
		userName.sendKeys("akhil");

		WebElement userPassword = driver.findElement(By.name("inputPassword"));
		userPassword.sendKeys("password!23");

		WebElement signIn = driver.findElement(By.xpath(".//button[@class='submit signInBtn']"));
		signIn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String invalidError = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println("Error found:" + invalidError);

		driver.findElement(By.xpath("(//a[normalize-space()='Forgot your password?'])[1]")).click();

		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("akhil");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("akhil.p@factweavers.com");
		driver.findElement(By.xpath("(//input[@placeholder='Phone Number'])[1]")).sendKeys("9207989997");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement resetLogin = driver.findElement(By.xpath(".//button[@class='reset-pwd-btn']"));
		Thread.sleep(1000);
		resetLogin.click();

		String infoMsg = driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println("info message: " + infoMsg);
		resetLogin.click();
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		userName.sendKeys("akhil");
		userPassword.sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		signIn.click();

		driver.findElement(By.className("logout-btn")).isDisplayed();
		System.out.println("User successfully loged in");
		Thread.sleep(5000);
		driver.close();

	}

}

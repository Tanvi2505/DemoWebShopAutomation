package com.demowebshop.base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void invalidLogin() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("abc123");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		System.out.println("Invalid login test completed");

		driver.quit();
	}

	@Test
	public void validLogin() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("suryawanshitanvi468@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Tanvi-123");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		System.out.println("Valid login test completed");

		driver.quit();
	}
}

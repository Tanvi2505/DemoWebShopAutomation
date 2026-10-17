package com.demowebshop.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoppingCart {

	@Test(groups = "perform")
	public void addProductToCart() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("ladakshata2004@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Akshata@9999");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		driver.findElement(By.id("small-searchterms")).sendKeys("14.1-inch Laptop");

		driver.findElement(By.xpath("//input[@value='Search']")).click();

		driver.findElement(By.linkText("14.1-inch Laptop")).click();

		driver.findElement(By.id("add-to-cart-button-31")).click();

		driver.findElement(By.linkText("Shopping cart")).click();

		System.out.println("Product added to cart successfully");

		driver.quit();
	}

	@Test
	public void removeProductFromCart() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("ladakshata2004@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Akshata@9999");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		driver.findElement(By.id("small-searchterms")).sendKeys("14.1-inch Laptop");

		driver.findElement(By.xpath("//input[@value='Search']")).click();

		driver.findElement(By.linkText("14.1-inch Laptop")).click();

		driver.findElement(By.id("add-to-cart-button-31")).click();

		driver.findElement(By.linkText("Shopping cart")).click();

		driver.findElement(By.name("removefromcart")).click();

		driver.findElement(By.name("updatecart")).click();

		System.out.println("Product removed from cart successfully");

		driver.quit();
	}
}
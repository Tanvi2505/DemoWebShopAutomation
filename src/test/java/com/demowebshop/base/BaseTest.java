package com.demowebshop.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    public static WebDriver driver = null;
    public static ChromeOptions options = null;

    @Parameters("browser")
    @BeforeClass
    public static void precondition(@Optional("chrome") String browser) {
        options = new ChromeOptions();
        options.addArguments("--incognito");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
    }


    @BeforeMethod(onlyForGroups = {"perform"})
    public static void login() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("suryawanshitanvi468@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("tanvi–123");
        driver.findElement(By.cssSelector("input.login-button")).click();
    }

    @AfterMethod
    public static void logout() {
        if (driver != null && !driver.findElements(By.xpath("//a[text()='Log out']")).isEmpty()) {
            driver.findElement(By.xpath("//a[text()='Log out']")).click();
        }
    }

    @AfterClass
    public static void postCondition() {
        if (driver != null) {
            driver.quit();
        }
    }
}
package com.browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Velmurugan {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
    //WebDriver.chromedriver().setup();
        
        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        
        // Open a website
        driver.get("https://practicetestautomation.com/practice-test-login");
        
        // Print the title
        System.out.println("Page Title: " + driver.getTitle());
        

        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("student");
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Password123");
        
       //driver.findElement(By.linkText("Courses")).click();  
       // driver.findElement(By.id("search-input")).sendKeys("Python Courses");  
        driver.findElement(By.id("submit")).click(); 
        Thread.sleep(5000);
        

        
        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
       logout.click();
        
        
        
        //student
        //Password123
        // Close the browser
       driver.close();
        driver.quit();
    }
}



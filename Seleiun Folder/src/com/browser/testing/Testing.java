package com.browser.testing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
    public static void main(String[] args) {
        // Setup EdgeDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Launch Microsoft Edge
        WebDriver driver = new EdgeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

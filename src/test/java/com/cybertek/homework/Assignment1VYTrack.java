package com.cybertek.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1VYTrack {
    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome browser
        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 1.1 Maximize browser
        driver.manage().window().maximize();

        // 2.Go to https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");

        // 3.Enter correct username
        WebElement userNameBox = driver.findElement(By.id("prependedInput"));
        userNameBox.sendKeys("storemanager59");
        // Thread.sleep(5000);

        // 4.Enter incorrect password
        driver.findElement(By.id("prependedInput2")).sendKeys("User123" + Keys.ENTER);

        // 5.Verify title:
        String expectedTitle = "Invalid user name or password.";
        System.out.println("expected title = " + expectedTitle);
        String actualText = driver.findElement(By.xpath("//div[.='Invalid user name or password.']")).getText();
        System.out.println("actual title = " + actualText);

        if (actualText.equals(expectedTitle)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");



        }
        // driver.close();
    }

}

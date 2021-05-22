package com.cybertek.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("Gavin@gmail.com");

        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("123485632" + Keys.ENTER);
        Thread.sleep(20000);

        // 5.Verify title changed to:
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.close();






    }
}

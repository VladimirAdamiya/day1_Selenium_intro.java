package com.cybertek.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.className("_8eso")).getText();
        Thread.sleep(3000);
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        System.out.println();
        driver.close();


    }

}

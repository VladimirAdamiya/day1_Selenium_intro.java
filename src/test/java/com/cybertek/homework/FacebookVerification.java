package com.cybertek.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify title:
        // Expected: “Facebook -Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        System.out.println("expectedTitle = " + expectedTitle);

        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Thread.sleep(3000);


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!!!");
        }
        driver.close();


    }


}

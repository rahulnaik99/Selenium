package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class screenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
                driver= new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                driver.manage().deleteAllCookies();
        driver.get("https://www.youtube.com/");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\target\\Screenshot\\src.png"));








    }
}

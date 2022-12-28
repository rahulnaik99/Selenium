package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class deleteCookies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().deleteAllCookies();
        }







    }

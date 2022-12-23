package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webDriver {
    WebDriver dvr;

    public WebDriver driver(ChromeOptions options){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        return dvr = new ChromeDriver();

    }
    public WebDriver driver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        return dvr = new ChromeDriver();

    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameHandleAssignment {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");



        //Nested Frames

        driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-middle']")));
        System.out.println(driver.findElement(By.id("content")).getText());
        }







    }

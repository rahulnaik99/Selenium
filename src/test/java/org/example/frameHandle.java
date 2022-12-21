package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class frameHandle {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        //switch using findElement
        //driver.switchTo().frame(driver.findElement(By.cssSelector("[class='demo-frame']")));
        //driver.findElement(By.id("[id='draggable']"));

        ///by index
        int i = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(i-1);
        Actions act = new Actions(driver);
        WebElement webElement = driver.findElement(By.id("draggable"));
        WebElement webElement1 = driver.findElement(By.id("droppable"));

        act.dragAndDrop(webElement,webElement1).build().perform();

        //back to main frame
        driver.switchTo().defaultContent();
        
        }







    }

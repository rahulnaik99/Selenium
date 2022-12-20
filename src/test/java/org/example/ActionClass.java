package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
         webDriver dri = new webDriver();
         WebDriver driver = dri.driver();
         driver.get("https://www.amazon.in/");
         Actions act = new  Actions(driver);
         //hover
         act.moveToElement(driver.findElement(By.cssSelector("span[class='icp-nav-flag icp-nav-flag-in icp-nav-flag-discoverability-t1']"))).build().perform();
         //click
         act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("OTG").build().perform();
         //double click
        act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("OTG").doubleClick().build().perform();

        //drag & drop




    }
}

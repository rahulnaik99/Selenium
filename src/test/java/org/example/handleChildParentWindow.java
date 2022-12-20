package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handleChildParentWindow {
    public static void main(String[] args) {
         webDriver dri = new webDriver();
         WebDriver driver = dri.driver();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.get("https://rahulshettyacademy.com/loginpagePractise/");
         driver.findElement(By.cssSelector("a[class='blinkingText']")).click();

         Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentID = it.next();
        String childID = it.next();


         driver.switchTo().window(childID);

         String str = driver.findElement(By.cssSelector("p[class='im-para red']")).getText();

        //splite string t=into two parts and trim the spaces
        String str1 = str.split("at")[1].trim().split(" ")[0].trim();
        System.out.println(str1);


         driver.switchTo().window(parentID);


        driver.findElement(By.id("username")).sendKeys(str1);
        driver.findElement(By.id("password")).sendKeys("learning");
        boolean flag = driver.findElement(By.cssSelector("input[id='terms']")).isSelected();
        if(flag==false){
            driver.findElement(By.cssSelector("input[id='terms']")).click();
        }

        driver.findElement(By.cssSelector("input[id='signInBtn']")).click();



    }
}

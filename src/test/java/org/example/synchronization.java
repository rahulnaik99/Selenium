
//implicit wait :
//we define n number of sec; Applicable until present drive terminated; once elem is availble then come out from wait;
//con:not able to estimate the performance of the web
// Explicit wait :
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class synchronization {

    public static void Cart(WebDriver driver){
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

    }
}





//implicit wait :
//we define n number of sec; Applicable until present drive terminated; once elem is availble then come out from wait;
//con:not able to estimate the performance of the web
// Explicit wait :
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

    public static void CartImplicit(WebDriver driver){
        driver.findElement(By.cssSelector("img[alt='CartImplicit']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

    }
    public static void CartExplicit(WebDriver driver){
        //WebDriverWait wait = new WebDriverWait(driver,5);

        driver.findElement(By.cssSelector("img[alt='CartImplicit']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        //wait
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("By.cssSelector(\"input[class='promoCode']\"")));

        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

    }

}




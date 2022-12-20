package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class googleSearch {
    static WebDriver driver;

    public static void main(String[] args) {

        webDriver dri = new webDriver();
        driver = dri.driver();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("[value='Google Search']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys("Rahul Naik");
        driver.findElement(By.cssSelector("[value='Google Search']")).click();
        driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys("Rahul Naik Yellapur");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
        driver.findElement(By.xpath("driver.findElement(By.cssSelector(\"span[class='rQEFy NZmxZe']\")).click();")).click();
        driver.findElement(By.xpath("//*[@id=\"Sva75c\"]/div[2]/div/div[2]/div[2]/div[2]/c-wiz/div[2]/div[1]/div[3]/div[1]/a[2]/div/span")).click();


    }
}

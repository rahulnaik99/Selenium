package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class youTube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions chrm = new ChromeOptions();
        chrm.setHeadless(true);

        int i=0;
        for( i=0; i<100;i++){
            try {
                driver= new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://www.youtube.com/");
                driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Farewell Preparation 2K19");
                driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
                driver.findElement(By.cssSelector("a[title='Farewell Preparation 2K19 | CSE | ft.SHUBHAM & RN']")).click();
                Thread.sleep(15000);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"info\"]/span[1]")).getText());
               // driver.quit();
            }
            catch (Exception e){s
                //driver.quit();
            }


        }







    }
}

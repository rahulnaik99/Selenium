package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class scrollJavaScript {
    public static void main(String[] args) throws InterruptedException {
        //tag A contains all the Links

        WebDriver driver = new webDriver().driver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
        ///driver.get("https://tcsglobal.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/3650936#notes");

        List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]"));
        for(int i=0;i< li.size();i++){
            System.out.println(Integer.parseInt(li.get(i).getText()));
        }
        String str = driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim();
        int  actual = Integer.parseInt(str);
        System.out.println(actual);


    }

}

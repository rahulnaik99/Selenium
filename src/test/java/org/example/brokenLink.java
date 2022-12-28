package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class brokenLink {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new webDriver().driver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //List<WebElement> links = driver.findElements(By.cssSelector("a[href]"));
        List<WebElement> links = driver.findElements(By.cssSelector("a[href*=h]"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links) {
            String str = link.getAttribute("href");
            System.out.println(link.getAttribute("href"));
            HttpURLConnection conn = (HttpURLConnection) new URL(str).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int resp = conn.getResponseCode();
            System.out.println(resp);
            a.assertTrue(resp<400,"Pass");

        }

       // String str = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
        a.assertAll();





    }

}

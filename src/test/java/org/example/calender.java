package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calender {
    public static void main(String[] args) throws InterruptedException {
        //tag A contains all the Links

        WebDriver driver = new webDriver().driver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.path2usa.com/travel-companion/");

        driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
        List<WebElement> li = driver.findElements(By.className("flatpickr-day*"));
        li.size();


    }

}

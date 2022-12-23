package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class assignment {
    public static void main(String[] args) throws InterruptedException {
        //tag A contains all the Links

        WebDriver driver = new webDriver().driver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        By checkBox = By.cssSelector("label[for='benz']");
        //boolean flag=false;
        if(!driver.findElement(checkBox).isSelected()){
            driver.findElement(checkBox).click();
        }
        String opion = driver.findElement(checkBox).getText();
        //List<WebElement> elem = );
        Select se = new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
        System.out.println(driver.findElement(checkBox).getText());
        se.selectByVisibleText(driver.findElement(checkBox).getText());





    }
}

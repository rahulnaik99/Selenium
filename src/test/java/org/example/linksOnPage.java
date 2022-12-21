package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linksOnPage {
    public static void main(String[] args) {
        //tag A contains all the Links
        WebDriver driver = new webDriver().driver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //tag A contains footer Links
        WebElement footer =    driver.findElement(By.cssSelector("[class='gf-t']"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        //tag A contains footerCoulmn 1 Links
        WebElement footerCol = footer.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[1]/ul"));
        System.out.println(footerCol.findElements(By.tagName("a")).size());

        for (int i=1;i<footerCol.findElements(By.tagName("a")).size();i++){
          //  footerCol.findElement((By.tagName("a"))).get(i);
        }
    }
}

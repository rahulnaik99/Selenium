package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class linksOnPage {  
    public static void main(String[] args) throws InterruptedException {
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

            String clickonnewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            footerCol.findElements((By.tagName("a"))).get(i).sendKeys(clickonnewtab);


        }
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){

            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }
}

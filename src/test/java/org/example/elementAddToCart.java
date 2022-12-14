package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;

import static org.example.synchronization.Cart;

public class elementAddToCart {
     static WebDriver driver;

    public static void main(String[] args) {

        webDriver dri = new webDriver();
        driver = dri.driver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        addProdToCart(driver);
        Cart(driver);


    }

    public static void addProdToCart(WebDriver driver) {
        String[] itemNeeded = {"Cucumber", "Brocolli"};
        List<String> itemNeededList = Arrays.asList(itemNeeded);
        List<WebElement> product = driver.findElements(By.cssSelector("h4[class='product-name']"));
        int j = 0;
        for (int i = 0; i < product.size(); i++) {
            String[] name = product.get(i).getText().split("-");
            String prodName = name[0].trim();
            if (itemNeededList.contains(prodName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            }
            if (j > itemNeeded.length) {
                break;
            }
        }
    }
}

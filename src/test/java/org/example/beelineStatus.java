package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class beelineStatus {
    public static void main(String[] args) throws InterruptedException {
        String[] reqID={"110275",
                "110148",
                "110239"
                ,"107852",
                "108262",
                "109689",
                "108335"
                ,"109018"
                ,"111124",
                "111126"
                ,"108703"
                ,"110929"
                ,"110930"};
        //System.setProperty("web.driver.chrome","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
       // driver =new ChromeDriver();
        driver = new ChromeDriver();
        //driver.get("www.google.com");
        driver.get("https://prod.beeline.com/pnc");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("naik.r@tcs.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rahulnaik@ylp99#91410");
        driver.findElement(By.cssSelector("span[class='auth0-label-submit']")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("MenuItem_5afb9f166b034b1d8d3cace9ed5ca994")).click();
        driver.findElement(By.id("MenuItem_eb84ee798caf4bbcb2e002ab5e7ad0b5")).click();

        Thread.sleep(2000);
        for(String s : reqID) {


            driver.findElement(By.cssSelector("input[id='Master_PageContentPlaceHolder_screen_beelineForm_partEditor_procurementRequestGroupID']")).sendKeys(s);
            driver.findElement(By.id("beeline-form-filter_Master_PageContentPlaceHolder_screen_beelineForm")).click();
            driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_selectionList\"]/tbody/tr/td[2]/a")).click();
            int backCounnt;
            //System.out.println(driver.getTitle());
            if(driver.getTitle().equalsIgnoreCase("Beeline - Request Group Summary"))
            {
                backCounnt=4;
                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table/tbody/tr[2]/td/div/table[2]/tbody/tr/td/table/tbody/tr/td[2]/a")).click();

            }
            else {
                backCounnt=3;
            }


            driver.findElement(By.id("Master_PageContentPlaceHolder_screen_tabControl_tab_2")).click();

            int row = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/thead/tr[2]/th")).size();
            int col = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr")).size();
            try{
                if (row == 11) {
                    for(int k=1;k<=col;k++){
                        System.out.println(
                                s+" : "+
                                        driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[4]/a")).getText() +" : "+

                                        driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText()
                        );

                    }


                } else {
                    for(int l=1;l<=col;l++){

                        System.out.println(
                                s +" : "+
                                        driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[3]/a")).getText() +" : "+

                                        driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText()
                        );

                    }

                }

            }
            catch (Exception e){
                System.out.println(s+" : No Record Found");

            }
            for(int j=0;j<backCounnt;j++){
                driver.navigate().back();
            }


        }
    }
}

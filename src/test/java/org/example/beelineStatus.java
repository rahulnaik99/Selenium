package org.example;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class beelineStatus {
    //WebDriver driver;
    public static void logIn(@NotNull WebDriver driver){
        driver.get("https://prod.beeline.com/pnc");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("naik.r@tcs.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rahulnaik@ylp99#91410");
        driver.findElement(By.cssSelector("span[class='auth0-label-submit']")).click();
    }
    public static void getBeelineStatus(String[] reqID,WebDriver driver){
        //dropDowmn
        driver.findElement(By.id("MenuItem_5afb9f166b034b1d8d3cace9ed5ca994")).click();
        //request prompt
        driver.findElement(By.id("MenuItem_eb84ee798caf4bbcb2e002ab5e7ad0b5")).click();
        int S=00;
        String endDate="";
        for(String s : reqID) {

            System.out.println("");
            S=S+1;
            String SL = "Profile : "+S;

            //send ID & search
            driver.findElement(By.cssSelector("input[id='Master_PageContentPlaceHolder_screen_beelineForm_partEditor_procurementRequestGroupID']")).sendKeys(s);
            driver.findElement(By.id("beeline-form-filter_Master_PageContentPlaceHolder_screen_beelineForm")).click();

            //check ID is present or not
            try{
                driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_selectionList\"]/tbody/tr/td[2]/a")).click();
            }
            catch (Exception e){
                System.out.println(SL +"\n"+s+"\n"+"BeelineID not Found / Not Released for TCS");
                navigateBack(1,driver);
                continue;
            }

            int backCounnt;

            //check the desired page
            if(driver.getTitle().equalsIgnoreCase("Beeline - Request Group Summary"))
            {
                backCounnt=4;
                endDate=driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_beelineForm_requestGroupRequestsList_requestsSelectionList\"]/tbody/tr/td[7]")).getText();
                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table/tbody/tr[2]/td/div/table[2]/tbody/tr/td/table/tbody/tr/td[2]/a")).click();



              }

            else {
                backCounnt=3;
                endDate=driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_selectedTab_summary_beelineForm_endDateLabel\"]")).getText();
            }


            driver.findElement(By.id("Master_PageContentPlaceHolder_screen_tabControl_tab_2")).click();

            int row = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/thead/tr[2]/th")).size();
            int col = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr")).size();
            try{
                if (row == 11) {
                    for(int k=1;k<=col;k++){
                        if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText().equalsIgnoreCase("withdrawn")){
                            continue;
                        }
                        else {
                            System.out.println(SL +"\n"+
                                    s+"\n" +
                                            driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[4]/a")).getText()+"\n" +

                                            driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText()+"\n" +
                                            endDate
                            );

                        }

                    }


                } else {
                    for(int l=1;l<=col;l++){
                        if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText().equalsIgnoreCase("withdrawn")){
                            continue;
                        }
                        else{
                            System.out.println(SL +"\n"+
                                    s +
                                    "\n" +driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[3]/a")).getText()+"\n"  +

                                            driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText()+"\n" +
                                            endDate
                            );

                        }

                    }

                }

            }
            catch (Exception e){
                System.out.println(SL+"\n"+s+"\n"+"No Record Found \n"+
                       endDate);

            }
            navigateBack(backCounnt,driver);




        }
    }

    private static void navigateBack(int backCounnt, WebDriver driver) {
        for(int j=0;j<backCounnt;j++){
            driver.navigate().back();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String[] reqID={
                "111329",
                "111332",
                "111331",
                "107852",
                "108262",
                "109689",
                "108335",
                "109018",
                "111124",
                "111126",
                "108703",
                "110929",
                "110930",
                "111410"

        };
        //System.setProperty("web.driver.chrome","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\Selenium\\Selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logIn(driver);
        getBeelineStatus(reqID,driver);



    }
}

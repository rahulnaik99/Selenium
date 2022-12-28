package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class chromeOption {
    public static void main(String[] args) {
        WebDriver driver;
        webDriver dri = new webDriver();
        ChromeOptions   opt = new ChromeOptions();
        opt.setHeadless(true);
        HashMap<Object, Object> pref = new HashMap<Object, Object>();
        pref.put("download.default_directory","/User");
        
        driver=dri.driver(opt);

    }
}

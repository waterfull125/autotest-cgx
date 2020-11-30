package com.selenium.testcase;

import com.selenium.zulinpage.ZulinLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver ;
    ZulinLoginPage zulinLogin = new ZulinLoginPage(driver);
    @BeforeClass
    public void openBroser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void closeBroser(WebDriver driver){
        driver.quit();
    }
    @Test
    public void LoginTest(String accout,String passwd){
        zulinLogin.sendAccount(accout);
        zulinLogin.sendPasswd(passwd);
        zulinLogin.clickConfirmBtn();
    }
}

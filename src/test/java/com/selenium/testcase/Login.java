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
        driver.get("http://biz-node-dev.miaogoche.cn/home");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void closeBroser(WebDriver driver){
        driver.quit();
    }
    @Test
    public void LoginTest(){

        zulinLogin.sendAccount("chengguanxun");
        zulinLogin.sendPasswd("123456");
        zulinLogin.clickConfirmBtn();
        Assert.assertTrue(zulinLogin.isLogin());
    }
}

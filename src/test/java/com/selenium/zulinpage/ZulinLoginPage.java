package com.selenium.zulinpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZulinLoginPage {
    WebDriver driver;
    public static By accout = By.id("inputAccount");
    public static By passwd = By.id("inputPassword");
    public static By loginBtn = By.className("confirmBtn");

    public ZulinLoginPage(WebDriver driver){this.driver = driver;}

    public void sendAccount(String account){
        driver.findElement(accout).clear();
        driver.findElement(accout).sendKeys(account);

    }
    public void sendPasswd(String pass){
        driver.findElement(passwd).clear();
        driver.findElement(passwd).sendKeys(pass);
    }
    public void clickConfirmBtn(){
        driver.findElement(loginBtn).click();
    }
    public boolean isLogin(){
        return driver.getTitle()=="融租后台运营系统"?true:false;
    }

}

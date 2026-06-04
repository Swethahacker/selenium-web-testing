package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By txt_username = By.id("user-name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login-button");

    public LoginPage(WebDriver driver) { this.driver = driver; }

    public void enterCredentials(String user, String pass) {
        driver.findElement(txt_username).sendKeys(user);
        driver.findElement(txt_password).sendKeys(pass);
    }

    public void clickLogin() { driver.findElement(btn_login).click(); }
}


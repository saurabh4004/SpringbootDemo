package com.neosoft.SpringBasic.pages;


import com.neosoft.SpringBasic.annotation.PageScope;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

//@Lazy
@PageScope
public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public void PerformLogin() {

        webDriver.navigate().to("http://eaapp.somee.com");
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
    }

    public void PerformLogoff() {
        homePage.ClickLogout();
    }
}

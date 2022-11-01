package com.neosoft.SpringBasic.pages;

import com.neosoft.SpringBasic.annotation.PageScope;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//@Lazy
@PageScope
public class LoginPage extends BasePage{

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage ClickLogin() {
        btnLogin.click();
        return new HomePage();
    }

}

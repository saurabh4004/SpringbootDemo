package com.neosoft.SpringBasic.pages;


import com.neosoft.SpringBasic.annotation.PageScope;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//@Lazy
@PageScope
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using="Employee Details")
    WebElement lnkEmployeeDetails;

    @FindBy(how = How.LINK_TEXT, using = "Log off")
    public WebElement lnkLogout;


    public LoginPage ClickLogin() {
        lnkLogin.click();
        return new LoginPage();
    }

    public HomePage ClickLogout() {
        lnkLogout.click();
        return new HomePage();
    }

    public void ClickEmployeeList() {lnkEmployeeList.click();}

    public boolean isEmployeeDetailsExist() {return lnkEmployeeDetails.isDisplayed();}

}

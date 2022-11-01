package com.neosoft.SpringBasic.steps;

import com.neosoft.SpringBasic.models.UserDetails;
import com.neosoft.SpringBasic.pages.HomePage;
import com.neosoft.SpringBasic.models.TestUserDetails;
import com.neosoft.SpringBasic.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {

        homePage.ClickLogin();

        //Scenario scope
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }



    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExist() , true);

    }


    @And("I click logout link")
    public void iClickLogoutLink() {
        homePage.ClickLogout();
    }
}

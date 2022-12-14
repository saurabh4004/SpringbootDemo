package com.neosoft.SpringBasic.steps;

import com.neosoft.SpringBasic.models.TestUserDetails;
import com.neosoft.SpringBasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //var data = table.asList();
        loginPage.Login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}

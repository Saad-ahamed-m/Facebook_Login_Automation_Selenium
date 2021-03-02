package com.quinbay.cucumber.steps;

import com.quinbay.cucumber.CucumberHooks;
import com.quinbay.cucumber.Selenium;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;

public class MySteps {

    public MySteps() throws InterruptedException {
    }

    @Given("I am on facebook login page")
    public void iAmOnFacebookLoginPage() throws InterruptedException {
    }

    @When("I enter username as {string}")
    public void iEnterUsernameAs(String username) {
        CucumberHooks.obj.entername("sfdnfjdnfj@gmail.com");
        System.out.println(username);
    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) throws InterruptedException {
        CucumberHooks.obj.enterpass("fjdfjdf");
        System.out.println(password);
    }
    @Then("Login should fail")
        public void loginShouldFail () {
            if (CucumberHooks.obj.check())
            {
                System.out.println("Done");
            }
    }

    @And("This is a test")
    public void thisIsATest() {
        System.out.println("This is a test");
    }
}

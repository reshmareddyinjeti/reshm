package com.girls.stepdef;

import com.girls.pageobjects.SingUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingUpStepDef {
private SingUpPage singUpPage=new SingUpPage();
    @When("^I click the create account$")
    public void iClickTheCreateAccount() {

    }

    @And("^move to account page$")
    public void moveToAccountPage() {

    }

    @Then("^I enter the email and pass word and click the sing up button$")
    public void iEnterTheEmailAndPassWordAndClickTheSingUpButton() {

    }

    @Then("^I able to sing Up$")
    public void iAbleToSingUp() {
        singUpPage.sign();

    }
}

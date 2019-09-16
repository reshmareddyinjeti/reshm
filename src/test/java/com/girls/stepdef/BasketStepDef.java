package com.girls.stepdef;

import com.girls.pageobjects.BasketPage;
import com.girls.pageobjects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BasketStepDef {
    private BasketPage basketPage = new BasketPage();
    private ResultsPage resultsPage =new ResultsPage();

    @And("^I select the filtered \"([^\"]*)\"$")
    public void iSelectTheFiltered(String customerSelectedPrice) {
        resultsPage.sortBy(customerSelectedPrice);

    }
    @Then("^I can add the \"([^\"]*)\" to Basket$")
    public void iCanAddTheToBasket(String customerSelectedproduct) throws Throwable {
        basketPage.selectCustomerProduct(customerSelectedproduct);
    }

    @Then("^I can see the product in tne trolley$")
    public void iCanSeeTheProductInTneTrolley() {
    }


}
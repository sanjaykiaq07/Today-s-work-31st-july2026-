package com.stepdefinition;

import java.io.IOException;

import base.Baseclass;
import io.cucumber.java.en.*;
import pom.flipkartpage;

public class Stepdefinition extends Baseclass {

    flipkartpage fp;
    @Given("User launches Flipkart")
    public void user_launches_flipkart() {
        launchBrowser();
        fp = new flipkartpage(driver);
    }

    @When("User closes login popup")
    public void user_closes_login_popup() {
        fp.closeLoginPopup();
    }

    @When("User searches for {string}")
    public void user_searches_for(String product) {
        fp.searchProduct(product);
    }

    @When("User selects first product")
    public void user_selects_first_product() {
        fp.clickFirstProduct();
    }

    @When("User switches to product window")
    public void user_switches_to_product_window() {
        fp.switchWindow();
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {
        fp.addToCart();
    }

    @When("User clicks Place Order")
    public void user_clicks_place_order() {
        fp.placeOrder();
    }

    @Then("Checkout page should be displayed")
    public void checkout_page_should_be_displayed() throws IOException {
        fp.verifyCheckoutPage();
        fp.captureScreenshot();
        closeBrowser();
    }    

	private void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
}

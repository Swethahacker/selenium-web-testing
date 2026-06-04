package com.sauce.stepdefs;

import com.sauce.drivers.DriverFactory;
import com.sauce.pages.LoginPage;
import com.sauce.utils.CSVUtils;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;


public class StepDefs {
    // Lazy initialize page object
    private LoginPage login;

    @Given("I am on the login page")
    public void navigate() {
        DriverFactory.getDriver().get("https://www.saucedemo.com");
        login = new LoginPage(DriverFactory.getDriver());
    }

    @When("I enter username {string} and password {string}")
    public void enterCredentials(String user, String pass) {
        login.enterCredentials(user, pass);
    }

    @And("I click the login button")
    public void clickLogin() {
        login.clickLogin();
    }

    @When("I login using credentials from {string}")
    public void loginWithCSV(String path) throws Exception {
        List<String[]> testData = CSVUtils.getCSVData(path);
        login.enterCredentials(testData.get(0)[0], testData.get(0)[1]);
        login.clickLogin();
    }


    @Then("I should be redirected to the inventory page")
    public void verifyUrl() {
        String currentUrl = DriverFactory.getDriver().getCurrentUrl();
        Assert.assertTrue(
                "User not redirected to inventory page",
                currentUrl.contains("inventory")
        );
    }

    @Then("I should see an error message containing {string}")
    public void verifyError(String expectedError) {
        String actualError = DriverFactory.getDriver().
                findElement(By.cssSelector("[data-test='error']"))
                .getText();


        Assert.assertTrue(
                "Error message mismatch",
                actualError.contains(expectedError)
        );
    }
}



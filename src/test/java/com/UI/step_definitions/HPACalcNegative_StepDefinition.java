package com.UI.step_definitions;

import com.UI.pages.base_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HPACalcNegative_StepDefinition extends base_page {
    @Before
    public void before() {
        setUp();
        clickShowAllInput();

    }

    @After
    public void after() {
        close();
    }

    @When("User enters invalid values to Current combined annual income")
    public void i_enter_invalid_values_to_current_combined_annual_income() {

        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            combinedIncome.clear();
            combinedIncome.sendKeys(eachInValidValue);
            if (combinedIncome.getText().equals(eachInValidValue)) {
                ci_errorMessage.isDisplayed();
            }
        }
    }

    @Then("User should be able to see the error message")
    public void error_message() {
        Assert.assertTrue(ci_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Monthly auto payments")
    public void user_enters_invalid_values_to_monthly_auto_payments() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            autoPayments.clear();
            autoPayments.sendKeys(eachInValidValue);
            if (autoPayments.getText().equals(eachInValidValue)) {
                autoP_errorMessage.isDisplayed();
            }
        }
    }

    @Then("User should be able to see the error message1")
    public void user_should_be_able_to_see_the_error_message1() {
        Assert.assertTrue(autoP_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Monthly association fees")
    public void user_enters_invalid_values_to_monthly_association_fees() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            associationFees.clear();
            associationFees.sendKeys(eachInValidValue);
            if (associationFees.getText().equals(eachInValidValue)) {
                asF_errorMessage.isDisplayed();

            }
        }
    }

    @Then("User should be able to see the error message2")
    public void user_should_be_able_to_see_the_error_message2() {
        Assert.assertTrue(asF_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Monthly child support payments")
    public void user_enters_invalid_values_to_monthly_child_support_payments() {

        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            childSupport.clear();
            childSupport.sendKeys(eachInValidValue);
            if (childSupport.getText().equals(eachInValidValue)) {
                chS_errorMessage.isDisplayed();

            }
        }
    }

    @Then("User should be able to see the error message3")
    public void user_should_be_able_to_see_the_error_message3() {
        Assert.assertTrue(chS_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Monthly credit card payments")
    public void user_enters_invalid_values_to_monthly_credit_card_payments() {

        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            ccPayments.clear();
            ccPayments.sendKeys(eachInValidValue);
            if (ccPayments.getText().equals(eachInValidValue)) {
                cc_errorMessage.isDisplayed();

            }
        }

    }

    @Then("User should be able to see the error message4")
    public void user_should_be_able_to_see_the_error_message4() {
        Assert.assertTrue(cc_errorMessage.isDisplayed());

    }

    @When("User enters invalid values to Other monthly obligations")
    public void user_enters_invalid_values_to_other_monthly_obligations() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            otherObligations.clear();
            otherObligations.sendKeys(eachInValidValue);
            if (otherObligations.getText().equals(eachInValidValue)) {
                otherObl_errorMessage.isDisplayed();

            }
        }

    }

    @Then("User should be able to see the error message5")
    public void user_should_be_able_to_see_the_error_message5() {
        Assert.assertTrue(otherObl_errorMessage.isDisplayed());

    }

    @When("User enters invalid values to Funds available for a down payment")
    public void user_enters_invalid_values_to_funds_available_for_a_down_payment() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            downPayment.clear();
            downPayment.sendKeys(eachInValidValue);
            if (downPayment.getText().equals(eachInValidValue)) {
                dP_errorMessage.isDisplayed();

            }
        }

    }

    @Then("User should be able to see the error message6")
    public void user_should_be_able_to_see_the_error_message6() {
        Assert.assertTrue(dP_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Estimated annual homeowner's insurance")
    public void user_enters_invalid_values_to_estimated_annual_homeowner_s_insurance() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            hazardInsurance.clear();
            hazardInsurance.sendKeys(eachInValidValue);
            if (hazardInsurance.getText().equals(eachInValidValue)) {
                hI_errorMessage.isDisplayed();

            }
        }
    }

    @Then("User should be able to see the error message7")
    public void user_should_be_able_to_see_the_error_message7() {
        Assert.assertTrue(hI_errorMessage.isDisplayed());

    }

    @When("User enters invalid values to Estimated annual property taxes")
    public void user_enters_invalid_values_to_estimated_annual_property_taxes() {
        List<String> invalidValues = new ArrayList<>(Arrays.asList("-1", "1,000,000,000", "$2345678", "abc"));
        for (String eachInValidValue : invalidValues) {
            propertyTaxes.clear();
            propertyTaxes.sendKeys(eachInValidValue);
            if (propertyTaxes.getText().equals(eachInValidValue)) {
                pT_errorMessage.isDisplayed();

            }
        }

    }

    @Then("User should be able to see the error message8")
    public void user_should_be_able_to_see_the_error_message8() {
        Assert.assertTrue(pT_errorMessage.isDisplayed());
    }

    @When("User enters invalid values to Annual interest rate on new mortgage")
    public void invalidValues_to_annual_interest_rate_mortgage() {

        List<String> invalidRates = new ArrayList<>(Arrays.asList("-1", "41", "345", "$5", "a"));
        for (String eachInvalidRate : invalidRates) {
            mortgageRate.clear();
            mortgageRate.sendKeys(eachInvalidRate);
            if (mortgageRate.getText().equals(eachInvalidRate)) {
                mr_errorMessage.isDisplayed();
            }
        }
    }

    @Then("the error message should be appeared")
    public void the_error_message_should_be_appeared() {
        Assert.assertTrue(mr_errorMessage.isDisplayed());
    }

}


package com.UI.step_definitions;

import com.UI.pages.base_page;
import com.UI.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HPACalculatorStepDefinition extends base_page {
    @Before
    public void before() {
        setUp();
        clickShowAllInput();

    }

    @After
    public void after() {
        close();
    }

    @Given("user sees both tabs at the same time")
    public void user_sees_both_tabs_at_the_same_time() {

        assertTrue(functionBox.isDisplayed());
    }

    @When("User enters: Current combined annual income")
    public void user_enters_current_combined_annual_income() {

        String defaultValue = combinedIncome.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        //System.out.println("actual = " + actual);
        //System.out.println("expectedValue = " + expectedValue);
        assertEquals(expectedValue, actual);
        combinedIncome.clear();
        combinedIncome.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = combinedIncome.getAttribute("value");
        //System.out.println("expectedIncome = " + expectedIncome);
        //System.out.println("actualIncome = " + actualIncome);
        assertEquals(expectedIncome, actualIncome);
    }

    @When("User enters: Monthly child support payments")
    public void user_enters_monthly_child_support_payments() {

        String defaultValue = childSupport.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        childSupport.clear();
        childSupport.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = childSupport.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Monthly auto payments")
    public void user_enters_monthly_auto_payments() {

        String defaultValue = autoPayments.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        autoPayments.clear();
        autoPayments.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = autoPayments.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Monthly association fees")
    public void user_enters_monthly_association_fees() {

        String defaultValue = associationFees.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        associationFees.clear();
        associationFees.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = associationFees.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Monthly credit card payments")
    public void user_enters_monthly_credit_card_payments() {

        String defaultValue = ccPayments.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        ccPayments.clear();
        ccPayments.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = ccPayments.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Other monthly obligations")
    public void user_enters_other_monthly_obligations() {

        String defaultValue = otherObligations.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        otherObligations.clear();
        otherObligations.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = otherObligations.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Funds available for a down payment")
    public void user_enters_funds_available_for_a_down_payment() {

        String defaultValue = downPayment.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        downPayment.clear();
        downPayment.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = downPayment.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);
    }

    @When("User enters: Estimated annual homeowner's insurance")
    public void user_enters_estimated_annual_homeowner_s_insurance() {

        String defaultValue = hazardInsurance.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        hazardInsurance.clear();
        hazardInsurance.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = hazardInsurance.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }

    @When("User enters: Estimated annual property taxes")
    public void user_enters_estimated_annual_property_taxes() {

        String defaultValue = propertyTaxes.getAttribute("value");
        int actual = Integer.parseInt(defaultValue);
        int expectedValue = Integer.parseInt("0");
        assertEquals(expectedValue, actual);
        propertyTaxes.clear();
        propertyTaxes.sendKeys("999,999,999");
        String expectedIncome = "999,999,999";
        String actualIncome = propertyTaxes.getAttribute("value");
        assertEquals(expectedIncome, actualIncome);

    }


    @When("User enters: Annual interest rate on new mortgage")
    public void user_enters_annual_interest_rate_on_new_mortgage() {

        mortgageRate.clear();
        mortgageRate.sendKeys("0");
        String actualRate = mortgageRate.getAttribute("value");
        String expectedRate = "0";
        //System.out.println("actualRate = " + actualRate);
        //System.out.println("expectedRate = " + expectedRate);
        assertEquals(expectedRate,actualRate);
        mortgageRate.clear();
        mortgageRate.sendKeys("40");
        String actualRate1 = mortgageRate.getAttribute("value");
        String expectedRate1 = "40";

        assertEquals(expectedRate, actualRate);
        //System.out.println("actualRate1 = " + actualRate1);
        //System.out.println("expectedRate1 = " + expectedRate1);

    }


    @When("User selects: Back-end ratio")
    public void user_selects_back_end_ratio() {

        Select bRatio = new Select(backRatio);
        WebElement option = bRatio.getFirstSelectedOption();
        String backDefaultValue = option.getText();
        String expectedValue = "36%";
        //System.out.println("backDefaultValue = " + backDefaultValue);
        //System.out.println("expectedValue = " + expectedValue);
        assertEquals(expectedValue, backDefaultValue);
        backRatio.click();

        List<String> expectedOption = new ArrayList<>(Arrays.asList("36%", "40%", "45%"));
        List<String> actualOption = new ArrayList<>();
        List<WebElement> backAllOptions = bRatio.getOptions();
        for (WebElement each : backAllOptions) {
            actualOption.add(each.getText());

        }
        //System.out.println("expectedOption = " + expectedOption);
        //System.out.println("actualOption = " + actualOption);
        assertEquals(expectedOption, actualOption);

        bRatio.selectByVisibleText("36%");
    }

    @When("User selects: Term of new mortgage")
    public void user_selects_term_of_new_mortgage_years() {

        Select term = new Select(mortgageTerm);
        WebElement option = term.getFirstSelectedOption();
        String defaultValue = option.getText();
        String expectedValue = "30";
        assertEquals(expectedValue, defaultValue);
        mortgageTerm.click();

        List<Integer> expectedOption = new ArrayList<>(Arrays.asList(15, 20, 30, 40));
        List<Integer> actualOption = new ArrayList<>();
        List<WebElement> termAllOption = term.getOptions();
        for (WebElement each : termAllOption) {
            actualOption.add(Integer.valueOf(each.getText()));

        }
        assertEquals(expectedOption, actualOption);

        term.selectByIndex(2);

    }

    @When("User selects: Front-end ratio")
    public void user_selects_front_end_ratio() {


        Select fRatio = new Select(frontRatio);
        WebElement option = fRatio.getFirstSelectedOption();
        String fDefaultValue = option.getText();
        String expectedValue = "28%";
        assertEquals(expectedValue, fDefaultValue);
        frontRatio.click();

        List<String> expectedOption = new ArrayList<>(Arrays.asList("28%", "33%", "36%"));
        List<String> actualOption = new ArrayList<>();
        List<WebElement> frontAllOptions = fRatio.getOptions();
        for (WebElement each : frontAllOptions) {
            actualOption.add(each.getText());

        }
        assertEquals(expectedOption, actualOption);

    }

    @When("User clicks on Calculate button")
    public void user_clicks_on_calculate() {
        calculateBTN.click();

    }

    @Then("Results and Summary Table should be displayed")
    public void results_summaryTable_displayed() {

        List<WebElement> webTabs = Driver.getDriver().findElements(By.id("results"));
        for (WebElement each : webTabs) {
            String actualResults = each.getText();
            String expectedResult = "RESULTS";
            String expectedResult1 = "SUMMARY TABLE";
            assertTrue(actualResults.contains(expectedResult));
            assertTrue(actualResults.contains(expectedResult1));

        }
    }

}

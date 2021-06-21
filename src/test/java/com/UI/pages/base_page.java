package com.UI.pages;

import com.UI.utilities.ConfigurationReader;
import com.UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class base_page {

    public base_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "showAllInputText")
    public WebElement ShowAllInput;

    @FindBy(xpath = "//div[@class='function box']")
    public WebElement functionBox;

    @FindBy(id = "combinedIncome")
    public WebElement combinedIncome;
    @FindBy(id = "combinedIncomeValidationMessage")
    public WebElement ci_errorMessage;

    @FindBy(id = "autoPayments")
    public WebElement autoPayments;
    @FindBy(id = "autoPaymentsValidationMessage")
    public WebElement autoP_errorMessage;

    @FindBy(id = "associationFees")
    public WebElement associationFees;
    @FindBy(id = "associationFeesValidationMessage")
    public WebElement asF_errorMessage;

    @FindBy(id = "childSupport")
    public WebElement childSupport;
    @FindBy(id = "childSupportValidationMessage")
    public WebElement chS_errorMessage;

    @FindBy(id = "ccPayments")
    public WebElement ccPayments;
    @FindBy(id = "ccPaymentsValidationMessage")
    public WebElement cc_errorMessage;

    @FindBy(id = "otherObligations")
    public WebElement otherObligations;
    @FindBy(id = "otherObligationsValidationMessage")
    public WebElement otherObl_errorMessage;

    @FindBy(id = "downPayment")
    public WebElement downPayment;
    @FindBy(id = "downPaymentValidationMessage")
    public WebElement dP_errorMessage;

    @FindBy(id = "propertyTaxes")
    public WebElement propertyTaxes;
    @FindBy(id = "propertyTaxesValidationMessage")
    public WebElement pT_errorMessage;

    @FindBy(id = "hazardInsurance")
    public WebElement hazardInsurance;
    @FindBy(id = "hazardInsuranceValidationMessage")
    public WebElement hI_errorMessage;

    @FindBy(id = "mortgageRate")
    public WebElement mortgageRate;
    @FindBy(id = "mortgageRateValidationMessage")
    public WebElement mr_errorMessage;

    @FindBy(id = "mortgageTerm")
    public WebElement mortgageTerm;

    @FindBy(id = "backRatio")
    public WebElement backRatio;

    @FindBy(id = "frontRatio")
    public WebElement frontRatio;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateBTN;

    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_lanPage"));
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void clickShowAllInput() {
        ShowAllInput.click();

    }

    public void close() {
        Driver.closeDriver();
    }

}

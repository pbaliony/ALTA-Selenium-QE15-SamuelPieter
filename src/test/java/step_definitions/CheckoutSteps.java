package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.pageObject.CartPage;
import test.pageObject.CheckoutPage;
import test.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);


    @And("click cart icon")
    public void clickCartIcon() {
        productPage.clickCartBtn();
    }

    @And("click checkout button")
    public void clickCheckoutButton() {
        cartPage.clickCheckout();
    }

    @And("Input FirstName {string} and LastName {string} and PostalCode {string}")
    public void inputFirstNameAndLastNameAndPostalCode(String FirstName, String LastName, String PostalCode) {
        checkoutPage.inputFrstname(FirstName);
        checkoutPage.inputLstname(LastName);
        checkoutPage.inputPostCode(PostalCode);
    }

    @And("click Continue button")
    public void clickContinueButton() {
        checkoutPage.clickContinueCheckout();
    }

    @And("click finish button")
    public void clickFinishButton() {
        checkoutPage.clickFinishCheckout();
    }

    @Then("should be displayed checkout complete with title {string}")
    public void shouldBeDisplayedCheckoutCompleteWithTitle(String ThankYouForOrder) {
        String getTitle = checkoutPage.getTitleThankYouForOrder();
        System.out.println(getTitle);
        Assert.assertEquals(ThankYouForOrder,getTitle);
    }
}

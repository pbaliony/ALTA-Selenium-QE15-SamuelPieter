package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.pageObject.Assignment1Page;
import test.pageObject.CartPage;
import test.pageObject.CheckoutPage;
import test.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Assignment1Steps {

    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    Assignment1Page assignment1Page= new Assignment1Page(driver);

    @Then("User should see error message {string}")
    public void userShouldSeeErrorMessage(String ErrorMssg) {
    String getTitle = assignment1Page.errormssgLockedOut();
        System.out.println(getTitle);
        Assert.assertEquals(ErrorMssg,getTitle);
    }

    @And("User should see wrong picture is displayed in product")
    public void userShouldSeeWrongPictureIsDisplayedInProduct() {
        Assert.assertTrue(assignment1Page.verifypictProblemUser());
    }

//    @And("User cannot click Add to Cart Button on product {string}")
//    public void userCannotClickAddToCartButtonOnProduct(String arg0) {
//        assignment1Page.clickproblemAddtoCart();
//    }

//    @And("User Should see missposition on Cart button")
//    public void userShoudSeeMisspositionOnButton(String arg0) {
//        Assert.assertTrue(assignment1Page.verifyProblemCartIcon());
//    }

    @And("Add to Cart button saucelabs bike light is displayed")
    public void addToCartButtonSaucelabsBikeLightIsDisplayed() {
        Assert.assertTrue(assignment1Page.verfiyAddtoCartbtnBikeLightDisplayed());
    }

    @And("Click Add to Cart saucelabs bike light")
    public void clickAddToCartSaucelabsBikeLight() {
      assignment1Page.clickAddToCartBtnBikeLight();
    }

    @Then("On the product page verify the saucelabs bike light")
    public void onTheProductPageVerifyTheSaucelabsBikeLight() {
        assignment1Page.verifyTitleBikeLight();
    }
}

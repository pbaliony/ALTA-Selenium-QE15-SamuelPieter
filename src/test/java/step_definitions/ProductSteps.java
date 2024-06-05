package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Product;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);

    @Then("On the product page verify the saucelabs backpack")
    public void onTheProductPageVerifyTheSaucelabsBackpack() {
        productPage.verifytitleProductSauceLabsBackpack();
    }
    @And("Add to Cart button saucelabs backpack is displayed")
    public void addToCartButtonSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartBtnDisplayedOnTheProductSauceLabsBackpack());
    }

    @And("Click Add to Cart saucelabs backpack")
    public void addRoCartSaucelabsBackpack() {
        productPage.clickAddToCartBtnProductSauceLabsBackpack();
        Assert.assertTrue(productPage.verifytitleProductSauceLabsBackpack());
    }
    @And("Remove button on the saucelabs backpack is displayed")
    public void removeButtonOnTheSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyRemoveBtnDisplayedOnTheProductSauceLabsBackpack());
    }
//    Assert Equals
//    Assert.assertEquals("expected", "actual");


// Click Remove Button
//    @And("Remove the saucelabs backpack from cart")
//    public void removeTheSaucelabsBackpackFromCart() {
//        productPage.clickRemoveBtnProductSauceLabsBackpack();
//        Assert.assertFalse(productPage.verifyRemoveBtnDisplayedOnTheProductSauceLabsBackpack());
//    }


}

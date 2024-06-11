package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.pageObject.ProductPage;
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

    @Then("On the product page verify the Product saucelabs bike light")
    public void onTheProductPageVerifyTheProductSaucelabsBikeLight() {
        productPage.verifytitleSauceLabsBikeLight();
    }

    @And("Add to Cart button Product saucelabs bike light is displayed")
    public void addToCartButtonProductSaucelabsBikeLightIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartbtnBikeLight());
    }

    @And("Click Add to Cart Product saucelabs bike light")
    public void clickAddToCartProductSaucelabsBikeLight() {
        productPage.clickAddToCartBikeLight();
        Assert.assertTrue(productPage.verifytitleSauceLabsBikeLight());
    }
//    Assert Equals
//    Assert.assertEquals("expected", "actual");


// Click Remove Button
    @And("Remove the saucelabs backpack from cart")
    public void removeTheSaucelabsBackpackFromCart() {
        productPage.clickRemoveBtnProductSauceLabsBackpack();
        Assert.assertFalse(productPage.verifyRemoveBtnDisplayedOnTheProductSauceLabsBackpack());
    }


    @Then("Sort Product from {string}")
    public void sortProductFrom(String arg0) {
        productPage.selectbySortNameAZ();
    }

    @And("Click Add to Cart saucelabs Onesie")
    public void clickAddToCartSaucelabsOnesie() {
        productPage.clickAddToCartBtnProductSauceLabsOnesie();
    }

    @And("Click Add to Cart saucelabs T-Shirt \\(Red)")
    public void clickAddToCartSaucelabsTShirtRed() {
        productPage.clickAddToCartBtnProductSauceLabsTShirtRed();
    }

    @And("Remove button on the saucelabs T-Shirt \\(Red) is displayed")
    public void removeButtonOnTheSaucelabsTShirtRedIsDisplayed() {
        productPage.verifyRemoveBtnDisplayedOnTheProductSauceLabsTShirtRed();
    }

    @And("Remove the saucelabs T-Shirt \\(Red) from cart")
    public void removeTheSaucelabsTShirtRedFromCart() {
        productPage.clickRemoveBtnProductSauceLabsTSHirtRed();
    }
}

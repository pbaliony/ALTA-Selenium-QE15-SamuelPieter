package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import test.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;
    @FindBy (id="remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;

    @FindBy (id="remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnRemoveSauceLabsTShirtRed;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCartSauceLabsBackpack;

    @FindBy (id = "add-to-cart-sauce-labs-onesie")
    private WebElement btnAddToCartSauceLabsOnesie;

    @FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement btnAddToCartSauceLabsTShirtRed;
    @FindBy (xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement btnCart;

    @FindBy (xpath = "//a[@id='item_0_title_link']")
    private WebElement titleSauceLabsBikeLight;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement btnAddtoCartBikeLight;

    @FindBy (xpath = "//option[.='Name (Z to A)']")
    private WebElement btnSortZA;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    private WebElement btnCartSortZA;

    public boolean verifytitleProductSauceLabsBackpack() {

        return isDisplayed(titleProductSauceLabsBackpack);
    }

    public boolean verifytitleSauceLabsBikeLight (){
        return isDisplayed(titleSauceLabsBikeLight);
    }

    public boolean verifyRemoveBtnDisplayedOnTheProductSauceLabsBackpack(){
    return isDisplayed(btnRemoveSauceLabsBackpack);
    }

    public void clickRemoveBtnProductSauceLabsBackpack (){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }

    public boolean verifyRemoveBtnDisplayedOnTheProductSauceLabsTShirtRed(){
        return isDisplayed(btnRemoveSauceLabsTShirtRed);
    }

    public void clickRemoveBtnProductSauceLabsTSHirtRed (){
        scrollIntoView(btnRemoveSauceLabsTShirtRed);
        waitForElementClickable(btnRemoveSauceLabsTShirtRed);
        click(btnRemoveSauceLabsTShirtRed);
    }

    public boolean verifyAddToCartBtnDisplayedOnTheProductSauceLabsBackpack(){
        return isDisplayed(btnAddToCartSauceLabsBackpack);
    }
    public void clickAddToCartBtnProductSauceLabsBackpack(){
        scrollIntoView(btnAddToCartSauceLabsBackpack);
        waitForElementClickable(btnAddToCartSauceLabsBackpack);
        click(btnAddToCartSauceLabsBackpack);
    }
    public void clickAddToCartBtnProductSauceLabsOnesie(){
        scrollIntoView(btnAddToCartSauceLabsOnesie);
        waitForElementClickable(btnAddToCartSauceLabsOnesie);
        click(btnAddToCartSauceLabsOnesie);
    }

    public void clickAddToCartBtnProductSauceLabsTShirtRed(){
        scrollIntoView(btnAddToCartSauceLabsTShirtRed);
        waitForElementClickable(btnAddToCartSauceLabsTShirtRed);
        click(btnAddToCartSauceLabsTShirtRed);
    }

    public boolean verifyAddToCartbtnBikeLight (){
        return isDisplayed(btnAddtoCartBikeLight);
    }

    public void clickAddToCartBikeLight (){
        scrollIntoView(btnAddtoCartBikeLight);
        waitForElementClickable(btnAddtoCartBikeLight);
        click(btnAddtoCartBikeLight);
    }

    public void clickCartBtn (){
        waitForElementClickable(btnCart);
        click(btnCart);
    }
    public void selectbySortNameAZ (){
        click(btnCartSortZA);
        click(btnSortZA);
    }
}


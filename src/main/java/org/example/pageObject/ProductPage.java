package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;
    @FindBy (id="remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCartSauceLabsBackpack;

    public boolean verifytitleProductSauceLabsBackpack() {
        return isDisplayed(titleProductSauceLabsBackpack);
    }

    public boolean verifyRemoveBtnDisplayedOnTheProductSauceLabsBackpack(){
    return isDisplayed(btnRemoveSauceLabsBackpack);
    }

    public void clickRemoveBtnProductSauceLabsBackpack (){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }

    public boolean verifyAddToCartBtnDisplayedOnTheProductSauceLabsBackpack(){
        return isDisplayed(btnAddToCartSauceLabsBackpack);
    }
    public void clickAddToCartBtnProductSauceLabsBackpack(){
        scrollIntoView(btnAddToCartSauceLabsBackpack);
        waitForElementClickable(btnAddToCartSauceLabsBackpack);
        click(btnAddToCartSauceLabsBackpack);
    }
}


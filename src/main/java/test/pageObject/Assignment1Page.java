package test.pageObject;

import test.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assignment1Page extends BasePage {
    public Assignment1Page (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h3[.='Epic sadface: Sorry, this user has been locked out.']")
    private WebElement mssgLockedOut;

    @FindBy (xpath = "//img[@alt='Sauce Labs Backpack']")
    private WebElement picProblemUser;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement problemAddtoCart;

    @FindBy (xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement problemCartIcon;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement btnaddtocartSaucelabsBikeLight;

    @FindBy (xpath = "//a[@id='item_0_title_link']")
    private WebElement titleBikeLight;

    public void verifyTitleBikeLight(){
        isDisplayed(titleBikeLight);
    }
    public String errormssgLockedOut(){
        return getText(mssgLockedOut);
    }
    public boolean verifypictProblemUser (){
        return isDisplayed(picProblemUser);
    }

    public void clickproblemAddtoCart (){
        scrollIntoView(problemAddtoCart);
        click(problemAddtoCart);
    }

    public boolean verifyProblemCartIcon (){
        return isDisplayed(problemCartIcon);
    }

    public boolean verfiyAddtoCartbtnBikeLightDisplayed (){
        return isDisplayed (btnaddtocartSaucelabsBikeLight);
    }

    public void clickAddToCartBtnBikeLight(){
//        scrollIntoView(btnaddtocartSaucelabsBikeLight);
//        waitForElementClickable(btnaddtocartSaucelabsBikeLight);
        click(btnaddtocartSaucelabsBikeLight);
    }
}

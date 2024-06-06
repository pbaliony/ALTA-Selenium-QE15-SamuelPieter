package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage (WebDriver driver){
        super(driver);
    }

    @FindBy (id = "first-name")
    private WebElement inputFirstName;

    @FindBy (id ="last-name")
    private WebElement inputLastName;

    @FindBy (id="postal-code")
    private WebElement inputPostalCode;

    @FindBy (id="continue")
    private WebElement btnContinueCheckout;

    @FindBy (id ="finish")
    private WebElement btnFinishCheckoout;

    @FindBy (xpath = "//h2[@class='complete-header']")
    private WebElement titleThankYouForOrder;

    public void inputFrstname (String FirstName){
        clear(inputFirstName);
        sendKeys(inputFirstName, FirstName);
    }

    public void inputLstname (String LastName){
        clear(inputLastName);
        sendKeys(inputLastName, LastName);
    }

    public void inputPostCode (String PostCode){
        clear(inputPostalCode);
        sendKeys(inputPostalCode, PostCode);
    }

    public void clickContinueCheckout (){
        waitForElementClickable(btnContinueCheckout);
        click(btnContinueCheckout);
    }

    public void clickFinishCheckout (){
        waitForElementClickable(btnFinishCheckoout);
        click(btnFinishCheckoout);
    }

    public String getTitleThankYouForOrder(){
        return getText(titleThankYouForOrder);
    }
}

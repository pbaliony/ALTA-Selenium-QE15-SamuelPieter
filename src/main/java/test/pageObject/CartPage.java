package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.BasePage;

public class CartPage extends BasePage {
    public CartPage (WebDriver driver){
        super(driver);
    }

    @FindBy (id="checkout")
    private WebElement btnCheckout;

    public void clickCheckout(){
        waitForElementClickable(btnCheckout);
        click(btnCheckout);
    }
}

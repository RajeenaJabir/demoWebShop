package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/

    private final String _addToCartMenu=" // add-to-cart-button-14";
    @FindBy(id =_addToCartMenu ) private WebElement addToCartMenu;

    private final String _shoppingCartCartMenu="//a[@class='ico-cart']//span[@class ='cart-label']";
    @FindBy(id =_shoppingCartCartMenu ) private WebElement shoppingCartCartMenu;


    /**User action methods**/
    public void clickOnShoppingCart(){
        page.clickOnElement(addToCartMenu);
    }
    public ShoppingCartPage clickOnShoppingCartMenu() {
        page.clickOnElement(shoppingCartCartMenu);
        return new ShoppingCartPage(driver);
    }
}

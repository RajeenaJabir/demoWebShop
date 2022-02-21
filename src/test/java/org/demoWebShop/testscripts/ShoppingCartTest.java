package org.demoWebShop.testscripts;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.demoWebShop.automationCore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.ProductListPage;
import org.demoWebShop.pages.ProductPage;
import org.demoWebShop.pages.ShoppingCartPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.demoWebShop.utilities.WaitUtility;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ShoppingCartTest extends Base {
    HomePage home;
    ExcelUtility excel = new ExcelUtility();
    ProductListPage productList;
    ProductPage product;
    ShoppingCartPage shoppingCart;
    WaitUtility waitUtility;

    @Test(priority = 1)
    public void verifyProductAddedInShoppingCart() {
        home = new HomePage(driver);
        List<List<String>> data = excel.excelDataReader("JewelleryPage");
        String option = data.get(1).get(0);
        productList = home.clickOnProductMenu(option);
        String value = data.get(1).get(1);
        productList.clickOnSortBy(value);
        String prdt = data.get(1).get(2);
        product = productList.clickOnProduct(prdt);
        product.clickOnShoppingCart();
        shoppingCart = product.clickOnShoppingCartMenu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String actualProductInCart = shoppingCart.getProductName();
        String expectedProductInCart = "Black & White Diamond Heart";
        Assert.assertEquals(actualProductInCart, expectedProductInCart, "ERROR::Cart Missmatch");
    }
}

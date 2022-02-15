package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    /**Page elements**/

    private final String _sortByOption="products-orderby";
    @FindBy(id = _sortByOption) private List<WebElement> sortByOption;

    private final String _blackDaimond="//h2[@class='product-title']//a[@href='/black-white-diamond-heart']";
    @FindBy(xpath =_blackDaimond ) private WebElement blackDaimond;

    /**User action methods**/
    public void clickOnSortBy(String value) {
        for (int i=0;i<sortByOption.size();i++) {
            String val = sortByOption.get(i).getText();
            if (val.equals(sortByOption)) {
                page.selectDropDownByValue(sortByOption.get(i), value);
            }
        }
    }
    public ProductPage clickOnblackdaimond() {
        page.clickOnElement(blackDaimond);
        return new ProductPage(driver);
    }

}

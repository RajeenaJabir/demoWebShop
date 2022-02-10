package org.demoWebShop.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class PageUtility {

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String value) {
        element.sendKeys(value);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public Point getLocation(WebElement element) {
        return element.getLocation();
    }

    public Dimension getDimensions(WebElement element) {
        return element.getSize();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public void selectDropDownByText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void deSelectDropDownByText(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }

    public void selectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void deSelectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public void selectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }
    public void deSelectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.deselectByIndex(value);
    }

    public List<WebElement> dropDownValuesOptions(WebElement element) {
        Select select = new Select(element);
        return select.getOptions();
    }
    public void selectDropDownByisMultiple(WebElement element) {
        Select select = new Select(element);
        select.isMultiple();
    }
    public void dropDownDeSelectall(WebElement element) {
        Select select = new Select(element);
        select.deselectAll();
    }

    public void acceptAlert(WebDriver driver) {
       Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void promptAlert(WebElement element,WebDriver driver, String value) {
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }
    public void confirmationAlert(WebElement element,WebDriver driver) {
        element.click();
        Alert alert = driver.switchTo().alert();
    }
    public String alertGetText(WebElement element,WebDriver driver) {
        element.click();
        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }

    public void doubleClick(WebDriver driver,WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
    }
    public void rightClick(WebDriver driver,WebElement source) {
        Actions actions = new Actions(driver);
        actions.contextClick(source).build().perform();
    }
    public void dragAndDrop(WebDriver driver,WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }
    public void dragAndDropByOffest(WebDriver driver,WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, x, y).build().perform();
    }
    public void moveToElement(WebDriver driver,WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(source, x, y).build().perform();
    }
    public void navigateTo(WebDriver driver,String url)
    {
        driver.navigate().to(url);
    }
    public void navigateForward(WebDriver driver)
    {
        driver.navigate().forward();
    }
    public void navigateBack(WebDriver driver)
    {
        driver.navigate().back();
    }
    public void navigateRefresh(WebDriver driver)
    {
        driver.navigate().refresh();
    }
    public void frameByIndex(WebDriver driver, int i) {
        Frame frame = new Frame();
        driver.switchTo().frame(i);
    }

    public void frameByNameOrId(WebDriver driver, String value) {
        Frame frame = new Frame();
        driver.switchTo().frame(value);
    }

    public void frameByWebElement(WebDriver driver, WebElement element) {
        Frame frame = new Frame();
        driver.switchTo().frame(element);
    }
    public String windowHandlesToGetParent(WebDriver driver){
        return driver.getWindowHandle();
    }

    public Set<String> windowHandlesToGetChild(WebDriver driver){
        return driver.getWindowHandles();
    }


}



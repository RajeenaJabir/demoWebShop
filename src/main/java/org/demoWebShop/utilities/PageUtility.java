package org.demoWebShop.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    public void selectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void dropDownValuesOptions(WebElement element, String value) {
        Select select = new Select(element);
        List<WebElement> dropDownValues = select.getOptions();
        for (WebElement i : dropDownValues) {
            if (i.getText().equals(value)) {
                i.click();
                break;
            }
        }
    }

    public void acceptAlert(Alert alert) {
        alert.accept();
    }

    public void dismissAlert(Alert alert) {
        alert.dismiss();
    }

    public void promptAlert(Alert alert, String value) {
        alert.sendKeys(value);
    }

    public void doubleClick(WebElement element, Actions action) {
        action.doubleClick(element).build().perform();
    }

    public void dragAndDrop(WebElement source, WebElement target, Actions action) {
        action.dragAndDrop(source, target).build().perform();
    }

    public void dragAndDropBy(WebElement source, Actions action, int x, int y) {
        action.dragAndDropBy(source, x, y).build().perform();
    }

    public void rightClick(WebElement source, Actions action) {
        action.contextClick(source).build().perform();
    }
}



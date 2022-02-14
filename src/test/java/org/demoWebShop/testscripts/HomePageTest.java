package org.demoWebShop.testscripts;

import org.demoWebShop.automationCore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends Base {
    HomePage home;
    ExcelUtility excel = new ExcelUtility();

    @Test(priority = 1)
    public void verifyHomePageTitle(){
        home = new HomePage(driver);
        List<String> data = excel.readDataFromExcel("HomePage");
        String expectedHomePageTitle = data.get(1);
        String actualHomePageTitle = home.getHomePageTitle();
        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "ERROR::Invalid HomePageTitle");
    }

}

package org.demoWebShop.testscripts;

import org.demoWebShop.automationCore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.LoginPage;
import org.demoWebShop.pages.UserAccountPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base {
    HomePage home;
    LoginPage login;
    UserAccountPage userAccountPage;
    ExcelUtility excel = new ExcelUtility();

    @Test(priority = 1)
    public void verifyValidLogin() {
        home = new HomePage(driver);
        login = home.clickOnLoginMenu();
        List<List<String>> data = excel.excelDataReader("LoginPage");
        String uname = data.get(1).get(0);
        login.enterUserName(uname);
        String pswd = data.get(1).get(1);
        login.enterPassword(pswd);
        userAccountPage = login.clickOnLoginButton();
        String actualEmailId = userAccountPage.getUserAccountEmail();
        Assert.assertEquals(actualEmailId, uname, "ERROR::Invalid Email ID");
    }
}

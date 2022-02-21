package org.demoWebShop.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.demoWebShop.automationCore.Base;
import org.demoWebShop.listeners.TestListener;
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
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();

    @Test(priority = 1,description = "TC_002_Verification of user login ")
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
        extentTest.get().log(Status.PASS, "User name entered successfully");
        extentTest.get().log(Status.PASS, "Password entered successfully");
        extentTest.get().log(Status.PASS, "clicked on login button successfully");
        extentTest.get().log(Status.PASS, "user logged in successfully");
    }
}


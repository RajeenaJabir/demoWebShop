package org.demoWebShop.utilities;

import org.demoWebShop.extentreport.ExtentManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestHelperUtility {
    public ExcelUtility excel = new ExcelUtility();
    public PageUtility page = new PageUtility();
    public TableUtility table = new TableUtility();
    public WaitUtility wait = new WaitUtility();
    public ExtentManager extentMgnr=new ExtentManager();
}

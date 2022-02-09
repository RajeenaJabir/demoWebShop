package org.demoWebShop.utilities;

import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotUtility {

    public void tabKey(Robot robot,KeyEvent keyEvent){
        robot.keyPress(KeyEvent.VK_TAB);
    }


}

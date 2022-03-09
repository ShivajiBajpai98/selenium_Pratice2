package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;

public class Email
{
    public static void email(By by, String firstname)
    {
        BaseCommons.webDriver.findElement(by).clear();
        BaseCommons.webDriver.findElement(by).sendKeys(firstname);
    }

}

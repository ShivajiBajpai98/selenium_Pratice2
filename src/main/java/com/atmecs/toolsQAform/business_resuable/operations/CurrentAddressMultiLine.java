package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import org.jsoup.Connection;
import org.openqa.selenium.By;

public class CurrentAddressMultiLine
{
    public static void currentAddress(By by, String address) {

        BaseCommons.webDriver.findElement(by).clear();
        BaseCommons.webDriver.findElement(by).sendKeys(address);


    }
}

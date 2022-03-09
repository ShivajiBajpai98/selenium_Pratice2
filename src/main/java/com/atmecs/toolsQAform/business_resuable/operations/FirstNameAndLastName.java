package com.atmecs.toolsQAform.business_resuable.operations;


import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;

public class FirstNameAndLastName
{


    public  static void firstName( By by, String firstname)
    {
        BaseCommons.webDriver.findElement(by).clear();
        BaseCommons.webDriver.findElement(by).sendKeys(firstname);
    }

    public  static void LastName(By by, String lastName)
    {
        BaseCommons.webDriver.findElement(by).clear();
        BaseCommons.webDriver.findElement(by).sendKeys(lastName);
    }

}

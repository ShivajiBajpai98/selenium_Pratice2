package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import org.openqa.selenium.By;

public class SubmitButton {
    public static void submitButton(By by)
    {

       BaseCommons.webDriver.findElement(by).click();
    }
}

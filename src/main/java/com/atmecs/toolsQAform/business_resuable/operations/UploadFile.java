package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;

public class UploadFile
{
    public static void fileUpload(By by,String filepath) {
        BaseCommons.webDriver.findElement(by).sendKeys(filepath);
    }
}

package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectState
{
    public static void clickStateDropDownEnterStateName (By by, String stateName) {

        BaseCommons.webDriver.findElement(by).sendKeys(stateName);
    }
    public static void selectStateName(By by, String sName){
    List<WebElement>list= BaseCommons.webDriver.findElements(by);

            for (WebElement webElement : list) {
                //System.out.println(webElement.getText());
                if (webElement.getText().equals(sName))
                {
                        webElement.click();
                        break;
                }
            }
        }



    }


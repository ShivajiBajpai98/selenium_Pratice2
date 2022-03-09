package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DateOfBirthCalender
{
    public static void openCalender(By by) {

        BaseCommons.webDriver.findElement(by).click();
    }
    public static void monthPick(By by, String month) {
        Select month_dropDown = new Select(BaseCommons.webDriver.findElement(by));
        month_dropDown.selectByVisibleText(month);
    }
    public static void yearPick(By by, String year) {
        Select year_dropDown = new Select(BaseCommons.webDriver.findElement(by));
        year_dropDown.selectByVisibleText(year);
    }

    public static void datePick(By by, String date)
    {
      //String dated="26";
     List<WebElement> allDates= BaseCommons.webDriver.findElements(by);
     for(WebElement element:allDates)
     {
         String dt=element.getText();
         //System.out.println(dt);
         if (dt.equals(date))
         {
             element.click();
             break;
         }

     }

    }
}

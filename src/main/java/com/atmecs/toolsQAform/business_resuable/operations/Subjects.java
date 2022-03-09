package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Subjects  {
    public static void subjectSelect(By by,String subject) {


        BaseCommons.webDriver.findElement(by).sendKeys(subject);
        // BaseCommons.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> list = BaseCommons.webDriver.findElements(By.xpath("//div[@id='react-select-2-option-2']"));
        // System.out.println(list.size());


        for (WebElement webElement : list) {
            //System.out.println(webElement.getText());
            Select select = new Select(webElement);
            select.selectByVisibleText(subject);

             /*   if (webElement.getText().contains("English"))
                {
                    webElement.click();
                    break;
                }
            }*/


        }

    }
}


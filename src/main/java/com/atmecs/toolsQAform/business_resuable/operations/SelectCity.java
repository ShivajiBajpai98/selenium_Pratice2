package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectCity
{


    public static void selectCity()
    {
        BaseCommons.webDriver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("N");
        List<WebElement> list = BaseCommons.webDriver.findElements(By.xpath("//div[@class=' css-11unzgr']//div"));

        for (WebElement webElement : list) {
            //System.out.println(webElement.getText());
            if (webElement.getText().equals("NCR")) {
                webElement.click();
                break;
            }
        }

        BaseCommons.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        BaseCommons.webDriver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();

        List<WebElement> lists = BaseCommons.webDriver.findElements(By.xpath("//div[@class=' css-11unzgr']//div"));

        for (WebElement webElement : lists) {
            //System.out.println(webElement.getText());
            if (webElement.getText().equals("Noida")) {
                webElement.click();
                break;
            }
        }
    }
public static void selectCityDropDown(By by)
{
    BaseCommons.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    BaseCommons.webDriver.findElement(by).click();


}

    public static void selectCityName(By by, String cityName)
    {
        List<WebElement> lists = BaseCommons.webDriver.findElements(by);

        for (WebElement webElement : lists) {
            //System.out.println(webElement.getText());
            if (webElement.getText().equals(cityName)) {
                webElement.click();
                break;
            }
        }
    }

}


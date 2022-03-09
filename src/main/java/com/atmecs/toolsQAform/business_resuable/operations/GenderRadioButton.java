package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GenderRadioButton {
    public  static void radioButtonWorking(By by) {


        WebElement radio_Button_Working = BaseCommons.webDriver.findElement(by);
        radio_Button_Working.click();


    }

    public static boolean selectGenderMale(By by)
    {
            WebElement radio_Button_Male = BaseCommons.webDriver.findElement(by);
            //radio_Button_Male.click();
            boolean selectState = radio_Button_Male.isSelected();
            //performing click operation only if element is not selected
            if (selectState==false) {
                radio_Button_Male.click();
                return selectState;
            }

            return false;
    }

    public static boolean selectGenderFemale(By by)
    {
        WebElement radio_Button_Female = BaseCommons.webDriver.findElement(by);
        //radio_Button_Female.click();
        boolean selectState = radio_Button_Female.isSelected();
        //performing click operation only if element is not selected
        if (selectState==false) {
            radio_Button_Female.click();
            return selectState;
        }
        return false;
    }

    // checking is selected working fine or not.
   /* public void selectGenderFemales()
    {
        WebElement radio_Button_Female = Base.webDriver.findElement(By.xpath(Locators.gender_female_radioButton_Rel_Xpath));
        boolean b= radio_Button_Female.isSelected();
        System.out.println(b);
    }*/


    public static boolean selectGenderOther(By by)
    {
        WebElement select_Gender_Other = BaseCommons.webDriver.findElement(by);
        //select_Gender_Other.click();
        boolean selectState = select_Gender_Other.isSelected();
        //performing click operation only if element is not selected
        if (selectState==false) {
            select_Gender_Other.click();
            return selectState;
        }
        return false;

    }
}
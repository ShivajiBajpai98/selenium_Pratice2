package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.operations.CheckBox;
import org.openqa.selenium.By;

public class TestCheckBox {
    public static void main(String[] args) {
        BaseLaunch.launch();
        CheckBox.elementListUnderHobbies(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
        //CheckBox.checkElement(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
       // CheckBox.numberOfCheckBoxes(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
       // CheckBox.clickAllCheckboxes(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
        //CheckBox.selectLastTwoCheckBoxes(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
       // CheckBox.verifyCheckboxIsSelectedOrNot(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
       // CheckBox.selectCheckBoxesByChoice(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath),"sports");

    }
}

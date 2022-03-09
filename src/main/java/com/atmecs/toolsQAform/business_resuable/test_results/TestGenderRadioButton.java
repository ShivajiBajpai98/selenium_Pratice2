package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.GenderRadioButton;
import org.openqa.selenium.By;

class TestGenderRadioButton {
    public static void main(String[] args) {
        BaseLaunch.launch();
        //GenderRadioButton.radioButtonWorking(By.xpath(Locators.gender_radioButton_Rel_Xpath));
        boolean selectMale= GenderRadioButton.selectGenderMale(By.xpath(Locators.gender_male_radioButton_Rel_Xpath));
       System.out.println("Select_Male"+" :"+selectMale);
        //boolean selectFemale = GenderRadioButton.selectGenderFemale(By.xpath(Locators.gender_female_radioButton_Rel_Xpath));
       //System.out.println("Select_Female"+" :"+selectFemale);
       // boolean selectOther= GenderRadioButton.selectGenderOther(By.xpath(Locators.gender_other_radioButton_Rel_Xpath));
        //System.out.println("Select_other"+" :"+selectOther);
    }
}
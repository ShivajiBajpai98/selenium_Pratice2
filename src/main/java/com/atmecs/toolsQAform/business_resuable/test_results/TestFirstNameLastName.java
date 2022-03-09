package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.FirstNameAndLastName;
import org.openqa.selenium.By;

public class TestFirstNameLastName {
    public static void main(String[] args) {
        BaseLaunch.launch();
        FirstNameAndLastName.firstName(By.xpath(Locators.first_Name_TextBox_Rel_Xpath),UserFormDetails.first_Name);
        FirstNameAndLastName.LastName(By.xpath(Locators.last_Name_TextBox_Rel_Xpath),UserFormDetails.last_Name);


    }
}

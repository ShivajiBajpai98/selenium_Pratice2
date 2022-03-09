package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.Subjects;
import org.openqa.selenium.By;

public class TestSubject {
    public static void main(String[] args) {
        BaseLaunch.launch();
        Subjects.subjectSelect(By.xpath(Locators.subject_TextBox_Rel_Xpath),UserFormDetails.subject);
        //Subjects.enterSubject(By.xpath(Locators.state_DropDown_Rel_Xpath), UserFormDetails.subject);
    }
}

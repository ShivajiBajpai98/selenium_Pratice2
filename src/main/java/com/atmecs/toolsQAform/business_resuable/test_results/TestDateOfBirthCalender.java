package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.DateOfBirthCalender;
import org.openqa.selenium.By;

public class TestDateOfBirthCalender {
    public static void main(String[] args) {
        BaseLaunch.launch();
        DateOfBirthCalender.openCalender(By.xpath(Locators.date_Of_Birth_Calender_Rel_Xpath));
        DateOfBirthCalender.monthPick(By.xpath(Locators.month_Pick),UserFormDetails.month);
        DateOfBirthCalender.yearPick(By.xpath(Locators.year_Pick),UserFormDetails.year);
        DateOfBirthCalender.datePick(By.xpath(Locators.date_Pick),UserFormDetails.date);
    }
}

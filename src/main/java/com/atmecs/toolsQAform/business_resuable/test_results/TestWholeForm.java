package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.*;
import org.openqa.selenium.By;

public class TestWholeForm {
    public static void main(String[] args) {
        BaseLaunch.launch();
        FirstNameAndLastName.firstName(By.xpath(Locators.first_Name_TextBox_Rel_Xpath), UserFormDetails.first_Name);
        FirstNameAndLastName.LastName(By.xpath(Locators.last_Name_TextBox_Rel_Xpath),UserFormDetails.last_Name);
        Email.email(By.xpath(Locators.email_TextBox_Rel_Xpath),UserFormDetails.e_Mail);
        GenderRadioButton.selectGenderMale(By.xpath(Locators.gender_male_radioButton_Rel_Xpath));
        MobileNumber.isValidMobileNumber(By.xpath(Locators.mobile_Number_TextBox_Rel_Xpath), UserFormDetails.mobile_Number);
        DateOfBirthCalender.openCalender(By.xpath(Locators.date_Of_Birth_Calender_Rel_Xpath));
        DateOfBirthCalender.monthPick(By.xpath(Locators.month_Pick),UserFormDetails.month);
        DateOfBirthCalender.yearPick(By.xpath(Locators.year_Pick),UserFormDetails.year);
        DateOfBirthCalender.datePick(By.xpath(Locators.date_Pick),UserFormDetails.date);
       // Subjects.subjectSelect(By.xpath(Locators.subject_TextBox_Rel_Xpath));
        UploadFile.fileUpload(By.xpath(Locators.insert_Picture_Rel_Xpath),UserFormDetails.file_Path);
        CurrentAddressMultiLine.currentAddress(By.xpath(Locators.current_Address_Rel_Xpath), UserFormDetails.address);
        SelectState.clickStateDropDownEnterStateName(By.xpath(Locators.state_DropDown_Rel_Xpath), UserFormDetails.stateName);
        SelectState.selectStateName(By.xpath(Locators.state_select_Rel_Xpath),UserFormDetails.sName);
        SelectCity.selectCityDropDown(By.xpath(Locators.city_Dropdown_Rel_Xpath));
        SelectCity.selectCityName(By.xpath(Locators.state_select_Rel_Xpath),UserFormDetails.city_Name);




    }
}

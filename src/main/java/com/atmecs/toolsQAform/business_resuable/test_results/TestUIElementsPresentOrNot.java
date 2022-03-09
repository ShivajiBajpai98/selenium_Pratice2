package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.function_resuable.UserAction;
import org.openqa.selenium.By;

public class TestUIElementsPresentOrNot {
    public static void main(String[] args) {
        BaseLaunch.launch();

        boolean page_Present_Rel_Xpath=  UserAction.isElementPresent( By.xpath(Locators.page_Present_Rel_Xpath));
        System.out.println("Page is present"+" : "+page_Present_Rel_Xpath);

        // get the page title and print
        String expectedTitle= UserAction.getTitle();
        System.out.println("Expected Title"+" : "+expectedTitle);

        // checks login name text box  is present or not returns print in terms of true or false
        boolean first_Name_TextBox_Rel_Xpath= UserAction.firstNameTextBox(By.xpath(Locators.first_Name_TextBox_Rel_Xpath));
        System.out.println("First_Name_TextBox_Present"+" : "+first_Name_TextBox_Rel_Xpath);

        // checks password text box  is present or not returns print in terms of true or false
        boolean last_Name_TextBox_Rel_Xpath =UserAction.lastNameTextBox(By.xpath(Locators.last_Name_TextBox_Rel_Xpath));
        System.out.println("Last_Name_TextBox_Present"+" : "+last_Name_TextBox_Rel_Xpath);

        boolean email_TextBox_id=  UserAction.emailTextBox(By.xpath(Locators.email_TextBox_Rel_Xpath));
        System.out.println("Email_TextBox_Present"+" : "+email_TextBox_id);

        boolean gender_radioButton_xpath=  UserAction.gender_radioButton(By.xpath(Locators.gender_radioButton_Rel_Xpath));
        System.out.println("Gender_RadioButton_Present"+" : "+gender_radioButton_xpath);

        boolean mobile_Number_TextBox_id= UserAction.mobileNumberTextBox(By.xpath(Locators.mobile_Number_TextBox_Rel_Xpath));
        System.out.println("Mobile_Number_TextBox_Present"+" : "+mobile_Number_TextBox_id);

        boolean date_Of_Birth_Calender_id= UserAction.dateOfBirthCalender(By.xpath(Locators.date_Of_Birth_Calender_Rel_Xpath));
        System.out.println("Date_Of_Birth_Calender_Present"+" : "+date_Of_Birth_Calender_id);

        boolean subject_TextBox_xpath= UserAction.subjectTextBox(By.xpath(Locators.subject_TextBox_Rel_Xpath));
        System.out.println("Subject_TextBox_Present"+" : "+subject_TextBox_xpath);

        boolean hobbies_CheckBoxes_xpath= UserAction.hobbiesCheckBoxes(By.xpath(Locators.hobbies_CheckBoxes_Rel_Xpath));
        System.out.println("Hobbies_CheckBoxes_Present"+" : "+hobbies_CheckBoxes_xpath);

        boolean insert_Picture_id= UserAction.insert_Picture(By.xpath(Locators.insert_Picture_Rel_Xpath));
        System.out.println("Insert_Picture_Present"+" : "+insert_Picture_id);

        boolean current_Address_Rel_Xpath= UserAction.insert_Picture(By.xpath(Locators.current_Address_Rel_Xpath));
        System.out.println("Current_Address_Present"+" : "+current_Address_Rel_Xpath);

        boolean state_DropDown_Rel_Xpath= UserAction.insert_Picture(By.xpath(Locators.state_DropDown_Rel_Xpath));
        System.out.println("State_DropDown_Present"+" : "+state_DropDown_Rel_Xpath);

        boolean city_Dropdown_Rel_Xpath= UserAction.insert_Picture(By.xpath(Locators.city_Dropdown_Rel_Xpath));
        System.out.println("City_Dropdown_Present"+" : "+city_Dropdown_Rel_Xpath);

        // check login button present or not and print true or false
        boolean submit_Button_Rel_Xpath= UserAction.submitButton(By.xpath(Locators.submit_Button_Rel_Xpath));
        System.out.println("Submit_Button_Present"+" : "+submit_Button_Rel_Xpath);



    }
}

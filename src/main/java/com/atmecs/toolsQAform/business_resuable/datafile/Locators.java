package com.atmecs.toolsQAform.business_resuable.datafile;


import com.atmecs.toolsQAform.business_resuable.properties.PropertyManager;

public class Locators {
    public static String page_Present_Rel_Xpath;
    public static String first_Name_TextBox_Rel_Xpath;
    public static String last_Name_TextBox_Rel_Xpath;
    public static String email_TextBox_Rel_Xpath;
    public static String gender_radioButton_Rel_Xpath;
    public static String gender_male_radioButton_Rel_Xpath;
    public static String gender_female_radioButton_Rel_Xpath;
    public static String gender_other_radioButton_Rel_Xpath;
    public static String mobile_Number_TextBox_Rel_Xpath;
    public static String date_Of_Birth_Calender_Rel_Xpath;
    public static String month_Pick;
    public static String year_Pick;
    public static String date_Pick;
    public static String subject_TextBox_Rel_Xpath;
    public static String subject_Auto_Suggest_Rel_Xpath;
    public static String hobbies_CheckBoxes_Rel_Xpath;
    public static String insert_Picture_Rel_Xpath;
    public static String current_Address_Rel_Xpath;
    public static String state_DropDown_Rel_Xpath;
    public static String state_select_Rel_Xpath;
    public static String  city_Dropdown_Rel_Xpath;
    public static String city_Select_Rel_Xpath;
    public static String  submit_Button_Rel_Xpath;



    public static void locators() {
        page_Present_Rel_Xpath = PropertyManager.getInstance().getPage_Present_Rel_Xpath();
        first_Name_TextBox_Rel_Xpath = PropertyManager.getInstance().getFirst_Name_TextBox_Rel_Xpath();
        last_Name_TextBox_Rel_Xpath = PropertyManager.getInstance().getLast_Name_TextBox_Rel_Xpath();
        email_TextBox_Rel_Xpath = PropertyManager.getInstance().getEmail_TextBox_Rel_Xpath();
        gender_radioButton_Rel_Xpath =PropertyManager.getInstance().getGender_radioButton_Rel_Xpath();
        gender_male_radioButton_Rel_Xpath=PropertyManager.getInstance().getGender_male_radioButton_Rel_Xpath();
        gender_female_radioButton_Rel_Xpath=PropertyManager.getInstance().getGender_female_radioButton_Rel_Xpath();
        gender_other_radioButton_Rel_Xpath=PropertyManager.getInstance().getGender_other_radioButton_Rel_Xpath();
        mobile_Number_TextBox_Rel_Xpath=PropertyManager.getInstance().getMobile_Number_TextBox_Rel_Xpath();
        date_Of_Birth_Calender_Rel_Xpath=PropertyManager.getInstance().getDate_Of_Birth_Calender_Rel_Xpath();
        month_Pick=PropertyManager.getInstance().getMonth_Pick();
        year_Pick=PropertyManager.getInstance().getYear_Pick();
        date_Pick=PropertyManager.getInstance().getDate_Pick();
        subject_TextBox_Rel_Xpath=PropertyManager.getInstance().getSubject_TextBox_Rel_Xpath();
        subject_Auto_Suggest_Rel_Xpath=PropertyManager.getInstance().getSubject_Auto_Suggest_Rel_Xpath();
        hobbies_CheckBoxes_Rel_Xpath=PropertyManager.getInstance().getHobbies_CheckBoxes_Rel_Xpath();
        insert_Picture_Rel_Xpath=PropertyManager.getInstance().getInsert_Picture_Rel_Xpath();
        current_Address_Rel_Xpath=PropertyManager.getInstance().getCurrent_Address_Rel_Xpath();
        state_DropDown_Rel_Xpath=PropertyManager.getInstance().getState_DropDown_Rel_Xpath();
        state_select_Rel_Xpath=PropertyManager.getInstance().getState_select_Rel_Xpath();
        city_Dropdown_Rel_Xpath=PropertyManager.getInstance().getCity_Dropdown_Rel_Xpath();
        city_Select_Rel_Xpath=PropertyManager.getInstance().getCity_Select_Rel_Xpath();
        submit_Button_Rel_Xpath=PropertyManager.getInstance().getSubmit_Button_Rel_Xpath();

          //System.out.println(Locators.bodyLocator_xpath);

      }

   /* public static void main(String[] args)
    {
        Locators.locators();

       System.out.println(Locators.hobbies_CheckBoxes_Rel_Xpath);
    }*/
}



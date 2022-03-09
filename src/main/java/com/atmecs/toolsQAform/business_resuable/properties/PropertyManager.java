package com.atmecs.toolsQAform.business_resuable.properties;



import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    //private static String propertyFilePath=System.getProperty("user.dir") + "\\configuration.properties";
    private static String app_url;
    private static String page_Present_Rel_Xpath;
    private static String first_Name_TextBox_Rel_Xpath;
    private static String last_Name_TextBox_Rel_Xpath;
    private static String email_TextBox_Rel_Xpath;
    private static String gender_radioButton_Rel_Xpath;
    private static String gender_male_radioButton_Rel_Xpath;
    private static String gender_female_radioButton_Rel_Xpath;
    private static String gender_other_radioButton_Rel_Xpath;
    private static String mobile_Number_TextBox_Rel_Xpath;
    private static String date_Of_Birth_Calender_Rel_Xpath;
    private static String month_Pick;
    private static String year_Pick;
    private static String date_Pick;
    private static String subject_TextBox_Rel_Xpath;
    private static String subject_Auto_Suggest_Rel_Xpath;
    private static String hobbies_CheckBoxes_Rel_Xpath;
    private static String insert_Picture_Rel_Xpath;
    private static String current_Address_Rel_Xpath;
    private static String state_DropDown_Rel_Xpath;
    private static String state_select_Rel_Xpath;
    private static String city_Dropdown_Rel_Xpath;
    private static String city_Select_Rel_Xpath;
    private static String submit_Button_Rel_Xpath;
    ////////////////////////////////////User details///////////////////////////
    private static String first_Name;
    private static String last_Name;
    private static  String e_Mail;
    private static String mobile_Number;
    private static String Is_Valid_Mobile_Number_With_Alphanumeric;
    private static String month;
    private static String year;
    private static String date;
    private static String subject;
    private static String file_Path;
    private static String address;
    private static String stateName;
    private static String sName;
    private static String city_Name;






    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            //prop.load(new FileInputStream(propertyFilePath));
            prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }


        //Get properties from configuration.properties
        app_url = prop.getProperty("app_url");
        page_Present_Rel_Xpath=prop.getProperty("page_Present_Rel_Xpath");
        first_Name_TextBox_Rel_Xpath=prop.getProperty("first_Name_TextBox_Rel_Xpath");
        last_Name_TextBox_Rel_Xpath=prop.getProperty("last_Name_TextBox_Rel_Xpath");
        email_TextBox_Rel_Xpath=prop.getProperty("email_TextBox_Rel_Xpath");
        gender_radioButton_Rel_Xpath=prop.getProperty("gender_radioButton_Rel_Xpath");
        gender_male_radioButton_Rel_Xpath=prop.getProperty("gender_male_radioButton_Rel_Xpath");
        gender_female_radioButton_Rel_Xpath=prop.getProperty("gender_female_radioButton_Rel_Xpath");
        gender_other_radioButton_Rel_Xpath=prop.getProperty("gender_other_radioButton_Rel_Xpath");
        mobile_Number_TextBox_Rel_Xpath=prop.getProperty("mobile_Number_TextBox_Rel_Xpath");
        date_Of_Birth_Calender_Rel_Xpath=prop.getProperty("date_Of_Birth_Calender_Rel_Xpath");
        month_Pick=prop.getProperty("month_Pick");
        year_Pick=prop.getProperty("year_Pick");
        date_Pick=prop.getProperty("date_Pick");
        subject_TextBox_Rel_Xpath=prop.getProperty("subject_TextBox_Rel_Xpath");
        subject_Auto_Suggest_Rel_Xpath=prop.getProperty("subject_Auto_Suggest_Rel_Xpath");
        hobbies_CheckBoxes_Rel_Xpath=prop.getProperty("hobbies_CheckBoxes_Rel_Xpath");
        insert_Picture_Rel_Xpath=prop.getProperty("insert_Picture_Rel_Xpath");
        current_Address_Rel_Xpath=prop.getProperty("current_Address_Rel_Xpath");
        state_DropDown_Rel_Xpath=prop.getProperty("state_DropDown_Rel_Xpath");
        state_select_Rel_Xpath=prop.getProperty("state_select_Rel_Xpath");
        city_Dropdown_Rel_Xpath=prop.getProperty("city_Dropdown_Rel_Xpath");
        city_Select_Rel_Xpath=prop.getProperty("city_Select_Rel_Xpath");
        submit_Button_Rel_Xpath=prop.getProperty("submit_Button_Rel_Xpath");
        ////////////////////////////////////////////////////////////////////
        first_Name=prop.getProperty("first_Name");
        last_Name=prop.getProperty("last_Name");
        e_Mail=prop.getProperty("e_Mail");
        mobile_Number=prop.getProperty("mobile_Number");
        Is_Valid_Mobile_Number_With_Alphanumeric=prop.getProperty("Is_Valid_Mobile_Number_With_Alphanumeric");
        month=prop.getProperty("month");
        year=prop.getProperty("year");
        date=prop.getProperty("date");
        subject=prop.getProperty("subject");
        file_Path=prop.getProperty("file_Path");
        address=prop.getProperty("address");
        stateName=prop.getProperty("stateName");
        sName=prop.getProperty("sName");
        city_Name=prop.getProperty("city_Name");





    }

    public String getAppManageURL() {return app_url;}
    public String getPage_Present_Rel_Xpath(){return page_Present_Rel_Xpath;}
    public String getFirst_Name_TextBox_Rel_Xpath(){return first_Name_TextBox_Rel_Xpath;}
    public String getLast_Name_TextBox_Rel_Xpath(){return last_Name_TextBox_Rel_Xpath;}
    public String getEmail_TextBox_Rel_Xpath(){return email_TextBox_Rel_Xpath;}
    public String getGender_radioButton_Rel_Xpath(){return gender_radioButton_Rel_Xpath;}
    public String getGender_male_radioButton_Rel_Xpath(){return gender_male_radioButton_Rel_Xpath;}
    public String getGender_female_radioButton_Rel_Xpath(){return gender_female_radioButton_Rel_Xpath;}
    public String getGender_other_radioButton_Rel_Xpath(){return gender_other_radioButton_Rel_Xpath;}
    public String getMobile_Number_TextBox_Rel_Xpath(){return mobile_Number_TextBox_Rel_Xpath;}
    public String getDate_Of_Birth_Calender_Rel_Xpath(){return date_Of_Birth_Calender_Rel_Xpath;}
    public String getMonth_Pick(){return month_Pick;}
    public String getYear_Pick(){return year_Pick;}
    public String getDate_Pick(){return date_Pick;}
    public String getSubject_TextBox_Rel_Xpath(){return subject_TextBox_Rel_Xpath;}
    public String getSubject_Auto_Suggest_Rel_Xpath(){return subject_Auto_Suggest_Rel_Xpath;}
    public String getHobbies_CheckBoxes_Rel_Xpath(){return hobbies_CheckBoxes_Rel_Xpath;}
    public String getInsert_Picture_Rel_Xpath(){return insert_Picture_Rel_Xpath;}
    public String getCurrent_Address_Rel_Xpath(){return current_Address_Rel_Xpath;}
    public String getState_DropDown_Rel_Xpath(){return state_DropDown_Rel_Xpath;}
    public String getState_select_Rel_Xpath(){return state_select_Rel_Xpath;}
    public String getCity_Dropdown_Rel_Xpath(){return city_Dropdown_Rel_Xpath;}
    public String getCity_Select_Rel_Xpath(){return city_Select_Rel_Xpath;}
    public String getSubmit_Button_Rel_Xpath(){return submit_Button_Rel_Xpath;}
    ////////////////////////////////////////////////////////////////////
    public String getFirst_Name(){return first_Name;}
    public String getLast_Name(){return last_Name;}
    public String getE_Mail(){return e_Mail;}
    public String getMobile_Number(){return mobile_Number;}
    public String getIs_Valid_Mobile_Number_With_Alphanumeric(){return Is_Valid_Mobile_Number_With_Alphanumeric;}
    public String getMonth(){return month;}
    public String getYear(){return  year;}
    public String getDate(){return date;}
    public String getSubject(){return subject;}
    public String getFile_Path(){return file_Path;}
    public String getAddress(){return address;}
    public String getStateName(){return stateName;}
    public String getsName(){return sName;}
    public String getCity_Name(){return city_Name;}



}
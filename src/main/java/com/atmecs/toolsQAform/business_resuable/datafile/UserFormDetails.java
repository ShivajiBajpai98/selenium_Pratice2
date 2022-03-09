package com.atmecs.toolsQAform.business_resuable.datafile;

import com.atmecs.toolsQAform.business_resuable.properties.PropertyManager;

public class UserFormDetails {
    public static String first_Name;
    public static String last_Name;
    public static String e_Mail;
    public static String mobile_Number;
    public static String Valid_Mobile_Number_With_Alphanumeric;
    public static String month;
    public static String year;
    public static String date;
    public static String subject;
    public static String file_Path;
    public static String address;
    public static String stateName;
    public static String sName;
    public static String city_Name;


    public static void userFormDetails()
    {
        first_Name= PropertyManager.getInstance().getFirst_Name();
     last_Name=PropertyManager.getInstance().getLast_Name();
        e_Mail=PropertyManager.getInstance().getE_Mail();
        mobile_Number=PropertyManager.getInstance().getMobile_Number();
        Valid_Mobile_Number_With_Alphanumeric=PropertyManager.getInstance().getIs_Valid_Mobile_Number_With_Alphanumeric();
        month=PropertyManager.getInstance().getMonth();
        year=PropertyManager.getInstance().getYear();
        date=PropertyManager.getInstance().getDate();
        subject=PropertyManager.getInstance().getSubject();
        file_Path=PropertyManager.getInstance().getFile_Path();
        address=PropertyManager.getInstance().getAddress();
        stateName=PropertyManager.getInstance().getStateName();
        sName=PropertyManager.getInstance().getsName();
        city_Name=PropertyManager.getInstance().getCity_Name();


    }
}

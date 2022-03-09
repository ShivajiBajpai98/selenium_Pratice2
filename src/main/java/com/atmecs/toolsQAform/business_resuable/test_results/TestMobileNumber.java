package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.MobileNumber;
import org.openqa.selenium.By;

public class TestMobileNumber
{
    public static void main(String[] args) {
        BaseLaunch.launch();
        MobileNumber.isValidMobileNumber(By.xpath(Locators.mobile_Number_TextBox_Rel_Xpath), UserFormDetails.mobile_Number);
      // boolean result= MobileNumber.isValidMobileNumberWithAlphanumeric(By.xpath(Locators.mobile_Number_TextBox_Rel_Xpath),UserFormDetails.Valid_Mobile_Number_With_Alphanumeric);
       //System.out.println("Is_Valid_Mobile_Number_With_Alphanumeric"+" ; "+result);

    }
}

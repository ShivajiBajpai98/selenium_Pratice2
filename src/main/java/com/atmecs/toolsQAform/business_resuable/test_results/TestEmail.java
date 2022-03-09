package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.Email;
import org.openqa.selenium.By;

public class TestEmail
{
    public static void main(String[] args) {
        BaseLaunch.launch();
        Email.email(By.xpath(Locators.email_TextBox_Rel_Xpath),UserFormDetails.e_Mail);

    }
}

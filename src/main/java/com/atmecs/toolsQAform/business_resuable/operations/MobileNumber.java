package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {


    public static void isValidMobileNumber(By by, String mNumber) {

        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // The number should be of 10 digits.

        // Creating a Pattern class object
        Pattern p = Pattern.compile("^\\d{10}$");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression for which
        // object of Matcher class is created
        Matcher m = p.matcher(mNumber);

        // Returning boolean value
        boolean result= (m.matches());
        if (result==true)
        {
            BaseCommons.webDriver.findElement(by).sendKeys(mNumber);
        }
        else {
            System.out.println("you entered wrong number");
        }

    }
    public   static boolean isValidMobileNumberWithAlphanumeric(By by, String alphaNumeric)
    {
       WebElement element= BaseCommons.webDriver.findElement(by);
       element.sendKeys(alphaNumeric);
        String val = element.getAttribute("value");
        System.out.println("Entered text is: " + val);
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
        Pattern p = Pattern.compile(regex);
        if (alphaNumeric == null) {
            return false;
        }
        Matcher m = p.matcher(alphaNumeric);
        return m.matches();

    }
}




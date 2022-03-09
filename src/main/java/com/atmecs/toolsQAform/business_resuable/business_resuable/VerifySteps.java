package com.atmecs.toolsQAform.business_resuable.business_resuable;


import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;

public class VerifySteps   {
    // check page title is equals expected title or not
    public static boolean verifyPageTitle( String expectedTitle)
    {
       String actualTitle= BaseCommons.webDriver.getTitle();
       //System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle))
        {
            System.out.println("Expected Title is same as actual title"+" "+actualTitle+" "+true);
        }
        else
            System.out.println("Expected title is not matched:"+actualTitle+" "+false);
        return false;



    }
}
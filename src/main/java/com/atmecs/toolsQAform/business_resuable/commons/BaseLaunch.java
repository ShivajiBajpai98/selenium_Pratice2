package com.atmecs.toolsQAform.business_resuable.commons;

import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;

public class BaseLaunch {
    public static void launch ()
    {
        BaseCommons.launchBrowser("chrome");
        BaseCommons.navigateUrl();
        BaseCommons.windowMaximize();
        Locators.locators();
        UserFormDetails.userFormDetails();

    }
}

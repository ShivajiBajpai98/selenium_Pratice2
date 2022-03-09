package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.SelectState;
import org.openqa.selenium.By;

public class TestStateSelect {
    public static void main(String[] args) {
        BaseLaunch.launch();
        SelectState.clickStateDropDownEnterStateName(By.xpath(Locators.state_DropDown_Rel_Xpath), UserFormDetails.stateName);
        SelectState.selectStateName(By.xpath(Locators.state_select_Rel_Xpath),UserFormDetails.sName);
    }
}

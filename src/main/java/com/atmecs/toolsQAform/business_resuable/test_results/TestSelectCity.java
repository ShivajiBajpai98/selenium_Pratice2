package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.SelectCity;
import com.atmecs.toolsQAform.business_resuable.operations.SelectState;
import org.openqa.selenium.By;

public class TestSelectCity {
    public static void main(String[] args) throws InterruptedException {
        BaseLaunch.launch();
        SelectState.clickStateDropDownEnterStateName(By.xpath(Locators.state_DropDown_Rel_Xpath), UserFormDetails.stateName);
        SelectState.selectStateName(By.xpath(Locators.state_select_Rel_Xpath),UserFormDetails.sName);
        //SelectCity.selectCity();
       SelectCity.selectCityDropDown(By.xpath(Locators.city_Dropdown_Rel_Xpath));
       SelectCity.selectCityName(By.xpath(Locators.state_select_Rel_Xpath),UserFormDetails.city_Name);
    }
}

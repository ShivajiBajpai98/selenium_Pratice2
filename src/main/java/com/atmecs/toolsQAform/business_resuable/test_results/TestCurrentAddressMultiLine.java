package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.CurrentAddressMultiLine;
import org.openqa.selenium.By;

public class TestCurrentAddressMultiLine {
    public static void main(String[] args) {
        BaseLaunch.launch();
        CurrentAddressMultiLine.currentAddress(By.xpath(Locators.current_Address_Rel_Xpath), UserFormDetails.address);
    }
}

package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.operations.SubmitButton;
import org.openqa.selenium.By;

public class TestSubmitButton {
    public static void main(String[] args) throws InterruptedException {
        BaseLaunch.launch();
        //Thread.sleep(50000);
        SubmitButton.submitButton(By.xpath("//button[@id='submit']"));
    }
}

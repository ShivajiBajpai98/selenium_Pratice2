package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.business_resuable.VerifySteps;
import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.function_resuable.UserAction;

public class TestVerify {
    public static void main(String[] args) {
        BaseLaunch.launch();
        String expectedTitle= UserAction.getTitle();
        System.out.println("Expected Title"+" : "+expectedTitle);
        VerifySteps.verifyPageTitle(expectedTitle);
    }
}

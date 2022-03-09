package com.atmecs.toolsQAform.business_resuable.test_results;

import com.atmecs.toolsQAform.business_resuable.commons.BaseLaunch;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import com.atmecs.toolsQAform.business_resuable.datafile.UserFormDetails;
import com.atmecs.toolsQAform.business_resuable.operations.UploadFile;
import org.openqa.selenium.By;

public class TestUploadFile {
    public static void main(String[] args) {
        BaseLaunch.launch();
        UploadFile.fileUpload(By.xpath(Locators.insert_Picture_Rel_Xpath),UserFormDetails.file_Path);
    }
}

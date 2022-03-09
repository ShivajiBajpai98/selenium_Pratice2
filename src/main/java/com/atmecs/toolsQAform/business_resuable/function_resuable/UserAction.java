package com.atmecs.toolsQAform.business_resuable.function_resuable;


import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class UserAction {


    // check page is present or not return and returns true or false
    public  static boolean isElementPresent(By by) {
        try {
            // String by1=PropertyManager.getInstance().getIsElementPresent_Xpath();
            BaseCommons.webDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {

            System.out.println("Locator(web element) is not present");
            return false;
        }
    }

    //  return website page title
    public static String getTitle() {
        return BaseCommons.webDriver.getTitle();
    }


    // check login name text box is present or  not and returns true or false
    public static boolean firstNameTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;
    }

    // check password check box present or not and returns true or false
    public static boolean lastNameTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean emailTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean gender_radioButton(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean mobileNumberTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }
    public static boolean dateOfBirthCalender(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }



    public static boolean subjectTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean hobbiesCheckBoxes(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean insert_Picture(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean currentAddress(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean stateDropDown(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    public static boolean cityDropdown(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;

    }

    // check login button present or not and returns true or false
    public static boolean submitButton(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator(web element) is not present");
        return false;
    }

    // check clear button present or not and returns true or false
    public static boolean clearButton(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Locator(web element) is not present");
                return false;
            }
        } else
            System.out.println("Locator is not present");
        return false;
    }
}
package com.atmecs.toolsQAform.business_resuable.operations;

import com.atmecs.toolsQAform.business_resuable.commons.BaseCommons;
import com.atmecs.toolsQAform.business_resuable.datafile.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckBox {

    public static void numberOfCheckBoxes(By by)
    {
        int checkboxes = BaseCommons.webDriver.findElements(by).size();
        System.out.println(checkboxes + " " + "Element or checkboxes present under Hobbies");
    }

    public static void elementListUnderHobbies (By by)
    {

        List<WebElement> elementList = BaseCommons.webDriver.findElements(by);
        System.out.println("Element under the Hobbies are below:");
        for (WebElement webElement : elementList) {
            System.out.println(webElement.getText());
        }
    }

    public static void checkElement(By by)
    {

        List<WebElement> selenium_element_list = BaseCommons.webDriver.findElements(by);
        List<String> element_list = new ArrayList<String>();
        for (WebElement element : selenium_element_list) {
            element_list.add(element.getText());
        }
        //System.out.println(strings);
        String[] elements_to_array = element_list.toArray(new String[0]);
        // Get the value to be checked
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the element you want to check");
        String toCheckValue = scanner.nextLine();
        boolean test = Arrays.asList(elements_to_array).contains(toCheckValue);
        // Print the result
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    public static void clickAllCheckboxes(By by) {

        List<WebElement> AllCheckboxes = BaseCommons.webDriver.findElements(by);
        int size = AllCheckboxes.size();
        System.out.println(size);


        for(int checkbox = 0; checkbox<size; checkbox++) {

            AllCheckboxes.get(checkbox).click();
        }


    }
    public static void verifyCheckboxIsSelectedOrNot(By by)
    {
        WebElement chkbox = BaseCommons.webDriver.findElement(by);

        if (chkbox.isSelected()) {

            System.out.println("Checkbox is ON");
        } else {

            BaseCommons.webDriver.findElement(by).click();
            System.out.println("Checkbox is Off");
        }
    }
        public static void selectLastTwoCheckBoxes (By by)
        {
            List<WebElement> ticks_select = BaseCommons.webDriver.findElements(by);
            int total_checkboxes = ticks_select.size();
            System.out.println(total_checkboxes + " " + "Element or checkboxes present under Department");
            for (int select_check_box = total_checkboxes - 2; select_check_box < total_checkboxes; select_check_box++) {
                ticks_select.get(select_check_box).click();
            }
        }

    public static void selectCheckBoxesByChoice (By by, String choice)
    {
        List <WebElement> AllCheckboxes =  BaseCommons.webDriver.findElements(by);
        int size = AllCheckboxes.size();
        for(int checkbox = 0; checkbox<size; checkbox++) {

            String value = AllCheckboxes.get(checkbox).getAttribute("value");

            if(value.equalsIgnoreCase(choice)){

                AllCheckboxes.get(checkbox).click();
                break;

            }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Obadiah
 */
public class CodingChallenge {
   
//Program Driver Code. 
    public static void main(String[] args) {

        //Program Introduction.Just a description about the Challenge.
        System.out.println("================================="
                + "\nWelcome to FrontlineSMS Coffee Checkin Coding Challenge!"
                + "\n=================================");
        // Get the Current Day and Date of the Week during execution.
        Calendar currentCalendar = Calendar.getInstance(new Locale("en", "UK"));
        System.out.println("Current Date : " + (currentCalendar.get(Calendar.MONTH) + 1) + "-"
                + currentCalendar.get(Calendar.DATE) + "-" + currentCalendar.get(Calendar.YEAR));

        //Store the Days of the Week in  an Array.
        String[] strDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thusday", "Friday",};
        int numberOfDays = strDays.length; // Number of Days for the Program to Run,

        int currentDay = 0; //The initial day(Monday)-The Program starts executing from this Day.
        System.out.println("Today is on: " + strDays[currentDay]);
        //Program Executes from Monday to Friday
        System.out.println("Program Execution Starts from Monday to Friday(Regular Working Days.)\n"
                + "Daily Stand-Up Meeting Starts at 9.55-Keep Time."
                + "\n=================================");
        //Taking user input(List of Company Employees on the Development Department Invloved in the Meeting.
        //The Number of Employee Invloved in the Meeting  may Keep Varying.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number of Employees in the Development Department.");
        int totalEmployees = Integer.parseInt(scanner.nextLine());

        //Create a string array to store the names of your Employees.
        String[] EmployeeNames = new String[totalEmployees];
        List<String> ofemps = new ArrayList<>();

        //Allow User to Input all the desired Employee Names checking on the Inital Number of Employee Keyed In.
        int empCounter = 1;
        for (int j = 0; j < EmployeeNames.length; j++) {
            System.out.print("Enter the Name of Employee" + " " + empCounter + ":\n");
            EmployeeNames[j] = scanner.nextLine();
            //Adding our Employees Names to an ArrayList.
            ofemps.add(EmployeeNames[j]);
            // Employee Names Counter
            empCounter++;

        }
        //Our Employees Array with the Keyed in Employee Names.
        String[] simpleempArray = new String[ofemps.size()];
        ofemps.toArray(simpleempArray);
        //Program Introduction
        System.out.println("================================="
                + "\nAll Software Developement Team!"
                + "\nThe list Begins with the Order of Coffee Checkin!"
                + "\n=================================");

        //Print the List of Employees in the Development Department..............
        System.out.println("The List of Employees in the Development Department ");
        //Print a list of All Employees Names thst should be involved in the Stand-Up meeting. 
        for (int i = 0; i < simpleempArray.length; i++) {
            System.out.print((i + 1) + " : ");
            System.out.print(simpleempArray[i] + "\n");
        }
        //Loop the Program Execution for Five Days: Monday to Friday.;
        do {
            //Prin the Execution Day of the Program
            System.out.println("=================================");
            System.out.println("Today is on:" + strDays[currentDay]);
            System.out.println("=================================");
            //Prompt user to Key In the Name of Late Employee,
            System.out.println("Enter the Name of Employee who is Late on:" + strDays[currentDay]);
            String latestaff = scanner.nextLine();
            //Output the Late Employee Name after Keying In.
            System.out.println("The Employee who is late on" + "  " + strDays[currentDay] + " " + "is: " + latestaff);
            //Get the Index of the Late Employee from the ArrayList.
            Boolean exist = checkArrayList(simpleempArray, latestaff);
            //Check if the late Employee exists in the Department from the Array Last.
            if (exist == true) {
                //Proceed if the Employee Exists else it will throw an Exception.
                try {
                    //Get the Index Value of the late Employee in the Array List using IndexOf Function.
                    int latepositionIndex = indexOf(simpleempArray, latestaff);//Late Employee Index;
                    int CoffeepositionIndex = latepositionIndex + 1;//Index of the Employee of Gets the Coffee;
                    int NextPositionIndex = CoffeepositionIndex + 1;//index of the Employee who is next for Coffee;
                    
                    //try to Prevent ArrayOutOfBound Exception when iterating throughout the array;
                    if (latepositionIndex >= 0 && latepositionIndex <= simpleempArray.length - 1) {
                        int lateposition = latepositionIndex;
                        //Prints employee who is late during the Day
                        System.out.println(simpleempArray[lateposition] + " <-Is Late");

                    } else {
                        int lateposition = 0;
                         //Prints employee who is late during the Day
                        System.out.println(simpleempArray[lateposition] + " <-Is Late");

                    }
                    if (CoffeepositionIndex >= 0 && CoffeepositionIndex <= simpleempArray.length - 1) {
                        int Coffeeposition = CoffeepositionIndex;
                         //Prints employee who gets Coffee for the Day
                        System.out.println(simpleempArray[Coffeeposition] + " <- Gets Coffee from:" + simpleempArray[latepositionIndex]);

                    } else {
                        int Coffeeposition = 0;
                         //Prints employee who gets Coffee for the Day
                        System.out.println(simpleempArray[Coffeeposition] + " <- Gets Coffee from:" + simpleempArray[latepositionIndex]);

                    }
                    if (NextPositionIndex >= 0 && NextPositionIndex <= simpleempArray.length - 1) {
                        int NextPosition = NextPositionIndex;
                         //Prints employee who is Next for Coffee on the following Day
                        System.out.println(simpleempArray[NextPosition] + " <-Is Next for Coffee Checkin");

                    } else {
                        //Preventing ArrayOutOfBound Exception from Occurring.
                        try {
                            if (latepositionIndex == simpleempArray.length - 2) {
                                int NextPosition = 0;
                                //Prints employee who is Next for Coffee on the following Day
                                System.out.println(simpleempArray[NextPosition] + " <-Is Next for Coffee Checkin");
                            } else {
                                int NextPosition = 1;
                                //Prints employee who is Next for Coffee on the following Day
                                System.out.println(simpleempArray[NextPosition] + " <-Is Next for Coffee Checkin");
                            }
                            //Catch the Exception when it Occurs
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    //Print the List of the Employees in the Order Beginning with the Late Employee .
                    var start = latepositionIndex;
                    for (var z = 0; z < simpleempArray.length; ++z) {
                        var i = (z + start) % simpleempArray.length;
                        System.out.print((i + 1) + " : ");
                        System.out.print(simpleempArray[i] + "\n");
                    }
                    //Catch the Exception 
                } catch (Exception e) {
                    e.printStackTrace();
                }
              //Print the Error if the Employee does not Exist in the ArrayList.
            } else {
                System.out.println("The Employee does not exist in the Department!!!!!!!:\n");
                System.out.println("Kindly Check on the List of Employees Names and try Again.:\n");
                
                //Program Execution to Remain on the same day until user Keys in the Correct Employee Name.
                currentDay--;
            }
            //Proceed to the Next Day of the Week if the late Employee Exists.
            currentDay++;
            
            //Loop throughout the days of the Week(Monday to Friday);
        } while (currentDay < numberOfDays);
    }

    // Function to return true if given element found in array.This is to check Employee within the Department.
    private static Boolean checkArrayList(String[] arr, String toCheckName) {
        // check if the specified element(Employee Name) is present in the array or not using Linear Search method 
        Boolean exists;
        String answer = "";
        Arrays.sort(arr);
        int r = Arrays.binarySearch(arr, toCheckName);
        if (r >= 0) {
            answer = String.format("%s found %d"
                    + "sorted array", toCheckName, r);
            exists = true;
        } else {
            answer = toCheckName + " was not found";
            exists = false;
        }
        //Return the results;
        return exists;
    }

    // Function to find the Index of the Late Employee in An Array of Staff
    public static int indexOf(String[] strArray, String element) {
        /*
         * Convert array to List and then use indexOf method of List class.
         */
        int index = Arrays.asList(strArray).indexOf(element);
        //Returns the Index value of the late Employee;
        return index;

    }
  //End;
}

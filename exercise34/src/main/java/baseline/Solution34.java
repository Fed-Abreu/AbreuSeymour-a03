package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution34 {
    public void employeeList(ArrayList<String>employees){
        for(String name:employees) {
            System.out.println(name);
        }

    }
    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        Scanner input = new Scanner(System.in);
        //Create a new ArrayList with employees John Smith, Jackie Jackson, Chris Jones, Amanda Cullen, Jeremy Goodwin
        ArrayList<String>employees = new ArrayList<>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        //Display There are "number in array" employees:
        System.out.println("There are " + employees.size() + " employees: ");

        // Then display the ArrayList
        sol.employeeList(employees);
        //Then Display Enter an employee name to remove: Scan as a String
        System.out.print("\nEnter an employee name to remove: ");
        String removeEmployee = input.nextLine();

        System.out.println();

        //Then remove employee("String")
        employees.remove(removeEmployee);

        System.out.println("There are " + employees.size() + " employees: ");

        //Then Display the new list of employees
        sol.employeeList(employees);

    }
}

package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution27 {
    //Create a String to store error message
     String errorMessage = "";

    public boolean firstNameTwoCharactersLong(String fName){
        //Make boolean status = true
        boolean message = true;
        //If(firstnameLength is < 2) print to error + "first name must be atleast 2 characters"
        if(fName.length() < 2){
            errorMessage = errorMessage + "The first name must be at least 2 characters long.\n";
            //Then make False and return
            message = false;
        }
        return message;

    }
    public boolean firstNameFilled(String fName){
        //Make true
        boolean message = true;
        //If(firstnameLength is == 0 print to error + "first name must be filled in"
        if(fName.length() == 0){
            errorMessage = errorMessage + "The first name must be filled in.\n";
            //Then make False and return
            message = false;
        }

        return message;
    }
    public boolean lastNameTwoCharactersLong(String lName){
        //Make true
        boolean message = true;
        //If(lastnameLength is < 2) print to error + "last name must be atleast 2 characters"
        if(lName.length() < 2){
            errorMessage = errorMessage + "The last name must be at least 2 characters long.\n";
        //Then make False and return
            message = false;
        }
        return message;

    }
    public boolean lastNameFilled(String lName){
        //Make true
        boolean message = true;
        //If(lastnameLength is == 0 print to error + "last name must be filled in"
        if(lName.length() == 0){
            errorMessage = errorMessage + "The last name must be filled in.\n";
        //then make false and return
            message = false;
        }

        return message;
    }

    public boolean employeeIDValid(String employID){
        //Make true
        boolean message = true;
        //Make a String pattern, so it matches something like [a-zA-Z] only having 2 and - with [0-9] only having 4
        String pattern = "[a-zA-Z]{2}[-][0-9]{4}";
        //if !pattern.math pattern,employeeID
        if(!Pattern.matches(pattern,employID)){
            //then print to error "employee ID must be in format"
            errorMessage = errorMessage + "The employee ID must be in a format of AA-1234.\n";
            //then make false and return
            message = false;
        }
        return message;
    }
    public boolean zipCodeValid(String zipCode){
        //Make true
        boolean message = true;
        try{
            //Make zipCode a number using Integer.parseInt
            int zipNumber = Integer.parseInt(zipCode);
            //if zipLength does not equal 5 then print to error "zipcode must be 5-digit number
            if(zipCode.length() != 5){
                errorMessage = errorMessage + "The zipcode must be a 5 digit number.\n";
                message = false;
            }
            //catch exception and print same error
            //then make false and return
        }catch(Exception e){
            errorMessage = errorMessage + "The zipcode must be a 5 digit number.\n";
            message = false;
        }

        return message;

    }
    public void validateInput(String fName, String lName, String zipCode, String employID){
        //boolean firstname = firstNameTwoCharactersLong
        boolean firstname = firstNameTwoCharactersLong(fName);
        //boolean firstFilled = firstNameFilled
        boolean firstFilled = firstNameFilled(fName);
        //boolean lastname = lastNameTwoCharactersLong
        boolean lastname = lastNameTwoCharactersLong(lName);
        //boolean lastFilled = lastNameFilled
        boolean lastFilled = lastNameFilled(lName);
        //boolean the rest
        boolean employeeID = employeeIDValid(employID);
        boolean zCode = zipCodeValid(zipCode);

        //if all of them are valid=true then error prints "there are no errors found
        if (firstname && firstFilled && lastname && lastFilled && employeeID && zCode){
            errorMessage = "There were no errors found";
        }
        //Display error message
        System.out.println(errorMessage);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution27 sol = new Solution27();

        //Display Enter the first name: and Scan String
        System.out.print("Enter the first name: ");
        String fName = input.nextLine();

        //Display Enter the last name: and Scan String
        System.out.print("Enter the last name: ");
        String lName = input.nextLine();

        //Display Enter the ZIP code: and Scan String
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();

        //Display Enter the employee ID: and Scan String
        System.out.print("Enter the employee ID: ");
        String employID = input.nextLine();

        sol.validateInput(fName,lName,zipCode,employID);

    }
}

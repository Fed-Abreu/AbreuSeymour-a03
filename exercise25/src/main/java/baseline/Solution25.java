package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution25 {
    String passwordStrength;
    public String passwordValidator(String password){
        //If password is ONLY Numbers and is < 8 on length Then Display it is a VERY WEAK password
        if(password.matches("[0-9]+") && password.length() < 8){
            passwordStrength = "very weak password.";
        }
        //If password is ONLY Letters and is < 8 on length THen Display it is a WEAK password
        else if(password.matches("[a-zA-Z]+") && password.length() < 8){
            passwordStrength = "weak password.";
        }
        //If password is BOTH Letters and AT LEAST ONE Number  and is >= 8 on length Then Display it is a STRONG password
        else if(password.matches("[0-9a-zA-Z]+") && password.length() >= 8){
            passwordStrength = "strong password.";
        }
        //If password contains Letters, Numbers, and Special Characters and is >= 8 Then Display it is a VERY STRONG password
        else if(password.matches("[0-9a-zA-Z!@#&()–[{}]:;',?/*~$^+=<>]+") && password.length() >= 8) {
            passwordStrength = "very strong password.";
        }
        //else Display password has an unknown strength
        else {
            passwordStrength = "unknown password strength.";

        }

        return passwordStrength;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution25 sol = new Solution25();
        //Display To enter a password and Scan Password as String
        System.out.print("Please enter a password: ");
        String password = input.nextLine();

        sol.passwordValidator(password);

        System.out.println("The password '"+ password + "' is a " + sol.passwordStrength);



    }
}

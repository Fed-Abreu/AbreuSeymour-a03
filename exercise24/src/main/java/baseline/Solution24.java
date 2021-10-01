package baseline;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution24 {
    //calculate Anagram using boolean
    public boolean isAnagram(String string1, String string2){
        //If first string doesn't have same length return false
        if (string1.length() != string2.length()){
            return false;
        }
        //ELSE Create a char[] array = to BOTH the strings
        else{
            char[] array1 = string1.toLowerCase().toCharArray();
            char[] array2 = string2.toLowerCase().toCharArray();

            //Then array.sort BOTH
            Arrays.sort(array1);
            Arrays.sort(array2);

            //then return array.equals(arrays)
            return Arrays.equals(array1, array2);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution24 sol = new Solution24();
        //Display Enter two strings, and I'll tell if they are anagrams:
        System.out.println("Enter two Strings and I'll tell you if they are anagrams: ");

        //Display Enter the first string: Scan the user input as a String
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();

        //Display Enter the second string: Scan in as String
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        //If true Display "string 1 and string 2 are anagrams
        if(sol.isAnagram(string1, string2)){
            System.out.print(string1 + " and " + string2 + " are anagrams. ");
        }
        //else Display string 1 adn string2  are not anagrams
        else{
            System.out.print(string1 + " and " + string2 + " are not anagrams. ");
        }



    }
}

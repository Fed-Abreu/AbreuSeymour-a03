package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    public Integer[] filterEvenNumbers(String[] numberArray){
        //Create a new evenNumberList
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        //loop the String and if the number is % 2 == 0 Then add to evenNumbersList
        for (String s : numberArray) {
            //Change Array to int to do Calculation
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                evenNumberList.add(number);
            }
        }
        return evenNumberList.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        Scanner input = new Scanner(System.in);
        //Display Enter a list of numbers, separated by spaces: and Scan String
        System.out.print("Enter a list of number, separated by spaces: ");
        String numbers = input.nextLine();

        //Then String [] = number.split(" ")
        String[] numberArray = numbers.split(" ");

        Integer[] evenList = sol.filterEvenNumbers(numberArray);

        //Display The even numbers are "and loop from the evenNumbersList to print"
        System.out.print("The even numbers are ");
        for(int i = 0; i < evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i]+ " ");
            }
            else{
                System.out.print(evenList[i] + ".");
            }
        }

    }
}

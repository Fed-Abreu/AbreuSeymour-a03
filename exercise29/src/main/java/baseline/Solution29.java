package baseline;

import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution29 {
    //throw an exception
    public String loopCalculator(){
        Scanner input = new Scanner(System.in);
        int number;
        //while true Display What is the rate of return Scan as int
        while(true) {
            try {
                System.out.print("What is the rate of return? ");
                number = Integer.parseInt(input.next());
                //Then print it will take 72/number year to doulbe investment
                System.out.println("It will take " + 72 / number + " years to double your initial investment.");
                break;
                //NumberFormatException and Arithmetic Exception
            }catch (NumberFormatException | ArithmeticException e){
                System.out.println("Sorry. That's not a valid input");
            }

        }

        return null;
    }
    public static void main(String[] args){
        Solution29 sol = new Solution29();

        sol.loopCalculator();

    }
}

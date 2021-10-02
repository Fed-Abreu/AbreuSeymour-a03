package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution28 {
    //make total = 0
    int total = 0;
    int number = 0;
    public int calculateTotal(){
        Scanner input = new Scanner(System.in);
        //for i = 0 i<5 i++
        for( int i = 0; i < 5; i++){
            //Display Enter a number: and Scan as int
            System.out.print("Enter a number: ");
           number = input.nextInt();

            //total += int
            total += number;
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution28 sol = new Solution28();

        sol.calculateTotal();

        //Print out total
        System.out.println("The total is " + sol.total + ".");


    }

}

package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution26 {


    //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaymentCalculator sol = new PaymentCalculator();
        //Display What is your Balance? Scan as double
        System.out.print("What is your balance? ");
        double balance = input.nextDouble();

        //Display What is your APR (as a percent)? Scan as double and divide by 100 to make it a percent
        System.out.print("What is the APR on the car (as a percent)? ");
        double apr = input.nextDouble();
        double percentAPR = apr / 100;
        double newAPR = percentAPR / 365;

        //Display What is the monthly payment you can make? Scan double
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = input.nextDouble();


        double months = sol.calculateMonthsUntilPaidOff(balance,monthlyPayment,newAPR);
        //Display It will take n number of months to pay off this card.
        System.out.println("It will take " + months + " months to pay off this card");







    }
}

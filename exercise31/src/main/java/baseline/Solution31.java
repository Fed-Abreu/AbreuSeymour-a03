package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution31 {

    public void heartRateCalculator(){
        Scanner input = new Scanner(System.in);
        //Try loop Until the user enters a valid heart rate and age
            try {
                //Display Enter Resting Heat Rate: and Scan int
                System.out.print("Enter resting heart rate: ");
                int restingPulse = input.nextInt();

                //Display Enter Age: and Scan int
                System.out.print("Enter Age: ");
                 int age = input.nextInt();

                //Display Resting Pulse: and Age:

                System.out.println("\nResting Pulse " + restingPulse + "        " + "Age: " + age + "\n");

                //Display Intensity    | Rate
                System.out.println("Intensity    | Rate");
                //Display -------------|--------
                System.out.println("-------------|--------");

                //For(int intensity = 55 intensity <=95 intensity += 5
                for(int intensity = 55; intensity <= 95; intensity +=5){
                    //Calculate heart rate using TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

                    int targetHeartRate = (((220 - age) - restingPulse) * intensity/100) + restingPulse;
                    //Display intensity%          | targetHeartRate bpm
                    System.out.println(intensity + "%" +"          | " + targetHeartRate + " bpm");
                }
                //Catch Exception e and Display enter only numbers
            } catch (Exception e) {
                System.out.println("This is not a valid input. ");
            }


    }
    public static void main(String[] args) {

        Solution31 sol = new Solution31();
        sol.heartRateCalculator();




    }
}

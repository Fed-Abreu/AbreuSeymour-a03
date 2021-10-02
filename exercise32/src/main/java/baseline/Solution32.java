package baseline;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution32 {
    private final Random rand = SecureRandom.getInstanceStrong();

    public Solution32() throws NoSuchAlgorithmException {
    }

    public String difficultyOfNumber(int difficulty, int randomNumber) {
        int totalAttempts = 0;
        int guess;
        while (true) {
            Scanner input = new Scanner(System.in);
            //if 1 play from number 1-10
            if (difficulty == 1)
                //set random number from range math.random*10+1
                randomNumber = this.rand.nextInt(10)+1;

                //else if 2 play from numbers 1-100
            else if (difficulty == 2)
                //set random number from range math.random*100+1
                randomNumber = this.rand.nextInt(100)+1;

                //else if 3 play from numbers 1-1000
            else
                //set random number from range math.random*1000+1
                randomNumber = this.rand.nextInt(1000)+1;
            try{


            //Display I have my number What's your guess?:
            System.out.print("I have my number. What's your guess? ");
            //do Scan input as int
            do {
                guess = Integer.parseInt(input.next());
                //totalTrys++
                totalAttempts++;

                //If Guess == RandomNumber Display You got it in "total" guesses!
                if (guess == randomNumber)
                    System.out.println("You got it in " + totalAttempts + " guesses!");

                    //else if guess < RandomNumber Display Too low. Guess again:
                else if (guess < randomNumber)
                    System.out.print("Too low. Guess again: ");

                    //else if guess > RandomNumber Display Too high. Guess again:
                else System.out.print("Too high. Guess again: ");

            }
            //while guess != RandomNumber Display you wish to play again (Y/N)? Scan as Char
            while (guess != randomNumber);
            System.out.print("\nDo you wish to play again (Y/N)? ");
            char choice = input.next().charAt(0);
            //if choice is N or n break
            if (choice == 'N' || choice == 'n')
                break;

        }catch (Exception e){
                System.out.println("This is not a valid input and It will count as a guess, please try again.");

            }
        }
        return null;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        Solution32 sol = new Solution32();
        //Display Let's play Guess the Number!
        System.out.println("Let's play Guess the Number! ");
        //while true try
        while(true){
            try{
                //Display Enter difficulty level (1,2,3): Scan int
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                int difficulty = Integer.parseInt(input.next());
                int randomNumber = r.nextInt(999)+1;
                sol.difficultyOfNumber(difficulty,randomNumber);
                break;
                //Catch Exception e Display Please Enter a valid input:
            }catch (Exception e){
                System.out.println("Sorry. That's not valid input, Please try again: ");
            }
        }





    }
}

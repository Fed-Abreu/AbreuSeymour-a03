package baseline;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution33 {
    //Make a new object Random rand Random()
    private final Random rand = SecureRandom.getInstanceStrong();

    public Solution33() throws NoSuchAlgorithmException {
    }

    public String magicBallResponses(){


        //String responses = Yes,No,Maybe,Ask again later
        String[] responses = {"Yes","No","Maybe","Ask again later"};

        //Choose an index using responseIndex = random.nextInt(Length)
        int responseIndex = this.rand.nextInt(responses.length);

        //Then make response = responseIndex
        String response = responses[responseIndex];

        //Display the response from magicBall
        System.out.println("\n" + response + ".");

        return response;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        Solution33 sol = new Solution33();

        //Display What is your question? and Scan String
        System.out.print("What's your question? \n> ");
        String question = input.nextLine();


        sol.magicBallResponses();


    }
}

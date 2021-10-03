package baseline;

import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution35 {
    private Random rand = SecureRandom.getInstanceStrong();

    public Solution35() throws NoSuchAlgorithmException {
    }

    public void nameWinner(){
        ArrayList<String>name = new ArrayList<>();
        String winnableName = null;
        Scanner input = new Scanner(System.in);
        //do a loop while name isnt blank
        do{
            System.out.print("Enter a name: ");
            winnableName = input.nextLine();

            //if the name isnt blank add name to the ArrayList
            if(!winnableName.isBlank())
                name.add(winnableName);

        }while(!winnableName.isBlank());
        //Then select a random name using new Random



        //Then winner = random.nextInt(name.size)
        int winner = this.rand.nextInt(name.size());
        //Display The winner is... winner
        System.out.println("The winner is... " + name.get(winner) + ".");
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Solution35 sol = new Solution35();
        //Create an ArrayList name = new ArrayList
       sol.nameWinner();


    }
}

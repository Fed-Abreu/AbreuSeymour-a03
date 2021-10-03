package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */

import java.util.*;


public class Solution37 {

    public String passwordGenerator(int length, int specialCharactersAmount,int numbersAmount){
        Random rand = new Random();
        //Create an ArrayList of those Characters
        ArrayList<Character>characters = new ArrayList<>();
        //String = all the values of possible Characters
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*_+=?/:<,>.{}';";
        String numbers = "1234567890";

        //Loop Each Character to add random Character to the Array
        for(int i = 0; i < specialCharactersAmount; i++){
            characters.add(specialCharacters.charAt(rand.nextInt(specialCharacters.length())));
        }
        for(int i = 0; i < numbersAmount; i++){
            characters.add(numbers.charAt(rand.nextInt(numbers.length())));
        }
        for(int i = characters.size()-1; i < length; i++){
            characters.add(letters.charAt(rand.nextInt(letters.length())));
        }
        //randomize order
        Collections.shuffle(characters);

        //Add that to the Password String
        StringBuilder password = new StringBuilder();
        for (Character c: characters){
            password.append(Character.toString(c));
        }
        return password.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution37 sol = new Solution37();
        //Display What's the minimum length? and Scan int
        System.out.print("What is the minimum length? ");
        int length = Integer.parseInt(input.nextLine());

        //Display How many special characters? and Scan int
        System.out.print("How many special characters? ");
        int specialCharactersAmount = Integer.parseInt(input.nextLine());

        //Display How many numbers? Scan int
        System.out.print("How many numbers? ");
        int numbersAmount = Integer.parseInt(input.nextLine());
        sol.passwordGenerator(length,specialCharactersAmount,numbersAmount);

        //Display Your password is "password"
        System.out.println("Your password is " + sol.passwordGenerator(length,specialCharactersAmount,numbersAmount));

    }
}

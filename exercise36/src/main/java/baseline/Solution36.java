package baseline;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution36 {
    public double average(ArrayList<Integer>numbers){
        //calculate average for num:numbers if average = total / number size
        int total = 0;
        for(int num: numbers){
            total += num;
        }
        double averageNumber = (double)(total)/ numbers.size();
        return averageNumber;

    }
    public int max(ArrayList<Integer>numbers){
        //calculate maximum for num:numbers if num > max max = num
        int max = numbers.get(0);
        for(int num:numbers){
            if(num > max)
                max = num;
        }
        return max;
    }
    public int min(ArrayList<Integer>numbers){
     //calculate minimum for num:numbers if num < min min = num
        int min = numbers.get(0);
        for(int num:numbers){
            if(num < min)
                min = num;
        }
        return min;
    }
    public double std(ArrayList<Integer>numbers){
        //calculate std for num: numbers sum = sum + Math.pow num - average, 2
        double avg = average(numbers);
        double sum = 0;
        for(int num:numbers){
            sum = sum + Math.pow((num - avg),2);
        }
        // Then Math.sqrt sum/number size
        return Math.sqrt(sum/numbers.size());
    }
    public static void main(String[] args) {
        Solution36 sol = new Solution36();
        Scanner input = new Scanner(System.in);
        //Create an ArrayList for numbers make them integers
        ArrayList<Integer> numbers = new ArrayList<>();
        String number = null;
        //do a while number != done loop
        do{
            //Display Enter a Number and Scan int
            System.out.print("Enter a number: ");
            number = input.next();
            //if int does not equal done
            if (!number.equals("done")){
                try{
                    //Then int num Integer parse int
                    int num = Integer.parseInt(number);
                    //numbers add (int)
                    numbers.add(num);
                    //catchException e
                }catch(NumberFormatException e) {
                    System.out.println("Not a valid input, try again.");
                }
            }
            //end while loop number != done
        }while(!number.equals("done"));

        //Display Numbers: All the numbers collected from Array
        System.out.println("Numbers: " + numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        //Display The average is average
        System.out.println("The average is " + sol.average(numbers));
        //Display The minimum is minimum
        System.out.println("The minimum is " + sol.min(numbers));
        //Display The maximum is maximum
        System.out.println("The maximum is " + sol.max(numbers));
        //Display The standard deviation is std
        System.out.println("The standard deviation is " + String.format("%.2f",sol.std(numbers)));





    }


}

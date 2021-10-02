package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution30 {
    public int multiplicationTable(){
        //for int i=1 i<+12 i++
        for (int i = 1; i <= 12; i++) {
            //for int j=1 j<=12 i ++
            for (int j = 1; j <= 12; j++) {
                //System.out.format Display I*j
                System.out.format("%4d", i * j);
            }
            //Print new line
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution30 sol = new Solution30();

        sol.multiplicationTable();

    }
}

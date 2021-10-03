package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    Solution36 sol = new Solution36();


    @Test
    void test_AverageisCorrect(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        double actualResults = sol.average(numbers);

        assertEquals(400,actualResults);

    }
    @Test
    void test_MaximumisCorrect(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        assertEquals(1000,sol.max(numbers));
    }
    @Test
    void test_MinimumisCorrect() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);


        assertEquals(100, sol.min(numbers));
    }
    @Test
    void test_StandardDeviationisCorrect() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);


        assertEquals(353.5533905932738, sol.std(numbers));
    }



}
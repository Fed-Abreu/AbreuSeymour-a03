package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    Solution31 sol = new Solution31();
    @Test
    void test_CalculatorValid(){


        int age = 22;
        int restingPulse = 65;
        int intensity = 55;

        int targetHeartRate = (((220 - age) - restingPulse) * intensity/100) + restingPulse;

        assertEquals(targetHeartRate, 138);

    }


}
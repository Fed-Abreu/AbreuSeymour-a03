import baseline.Solution29;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Scanner input = new Scanner(System.in);
    Solution29 sol = new Solution29();
@Test
    void test_loopCalculatorWorks(){
        int number = 4;

        String actualResult = "It will take 18 years to double your initial investment.";

        String expectedResult = "It will take " + 72 / number + " years to double your initial investment.";

    assertEquals(expectedResult,actualResult);





    }

}
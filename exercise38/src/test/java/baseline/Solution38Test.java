package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    Solution38 sol = new Solution38();
@Test
    void test_NumberDisplayEvenCorrect() {

    String numbers = "1 2 3 4 5 6 7 8";

    String[] numberArray = numbers.split(" ");

    Integer[] evenList = sol.filterEvenNumbers(numberArray);

    int expectedResults[] = {2,4,6,8};

    assertNotEquals(expectedResults,evenList);
}
}
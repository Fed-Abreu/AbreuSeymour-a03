package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    Solution37 sol = new Solution37();
    @Test
    void test_DisplaysPassword(){
        ArrayList<Character> characters = new ArrayList<>();
       String acutalResults = sol.passwordGenerator(8,2,2);
       String expectedResults = "";

       assertNotEquals(expectedResults,acutalResults);
    }
    @Test
    void test_ContainsTwoNumbersAndTwoSpecial() {

        ArrayList<Character> characters = new ArrayList<>();
        String Results = sol.passwordGenerator(8, 2, 2);
        if(Results.matches("[!@#$%^&*_+=?/:<,>.{}';]")) {
            assertEquals(true, false);
        }
    }

}
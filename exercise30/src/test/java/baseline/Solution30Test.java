package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    Solution30 sol = new Solution30();
    @Test
    void test_TimesTable(){
        int i = 0;
        int j = 0 ;
        sol.multiplicationTable();

        int expectedResults = i*j;

        assertEquals(expectedResults,sol.multiplicationTable());

    }

}
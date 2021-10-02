package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    public void test_LoopIsCorrect()throws Exception{
        Solution28 sol = new Solution28();
        for( int i = 0; i < 5; i++) {
            sol.number = 1;
            sol.total += sol.number;
        }
            assertEquals(5, sol.total);
    }


}
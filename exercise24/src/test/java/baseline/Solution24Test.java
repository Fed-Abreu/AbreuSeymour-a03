package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    void test_isAnagram_returns_false(){
        Solution24 sol = new Solution24();
        String string1 = "how";
        String string2 = "cow";

        boolean actual_return = sol.isAnagram(string1,string2);

        assertFalse(actual_return);

    }
    @Test
    void test_isAnagram_returns_true(){
        Solution24 sol = new Solution24();
        String string1 = "race";
        String string2 = "care";

        boolean actual_return = sol.isAnagram(string1,string2);

        assertTrue(actual_return);

    }


}
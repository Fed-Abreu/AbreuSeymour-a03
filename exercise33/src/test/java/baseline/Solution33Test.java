package baseline;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    Solution33 sol = new Solution33();

    Solution33Test() throws NoSuchAlgorithmException {
    }

    @Test
    void test_magicbalContainsRandomWord(){
        String actualResult = sol.magicBallResponses();

        String[] expecetedResults = {"Yes","No","Maybe","Ask again later"};

        assertEquals(expecetedResults,actualResult);
    }

}
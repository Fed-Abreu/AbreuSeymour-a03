package baseline;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    Solution32 sol = new Solution32();

    Solution32Test() throws NoSuchAlgorithmException {
    }

    @Test
    void test_GuessIsIncorrectInfinite(){

        assertEquals("I have my number. What's your guess? This is not a valid input and It will count as a guess, please try again.",sol.difficultyOfNumber(1,3));
    }

}
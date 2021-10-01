package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    Solution25 sol = new Solution25();
    @Test
    void test_passwordValidator_VeryWeak(){

        String password = "12345";

        String actual_password = sol.passwordValidator(password);
        String expected_password = "very weak password.";

        assertEquals(expected_password,actual_password);
    }
    @Test
    void test_passwordValidator_Weak(){

        String password = "abcdef";

        String actual_password = sol.passwordValidator(password);
        String expected_password = "weak password.";

        assertEquals(expected_password,actual_password);
    }
    @Test
    void test_passwordValidator_Strong(){

        String password = "abc123xyz";

        String actual_password = sol.passwordValidator(password);
        String expected_password = "strong password.";

        assertEquals(expected_password,actual_password);
    }
    @Test
    void test_passwordValidator_VeryStrong(){

        String password = "1337h@xor!";

        String actual_password = sol.passwordValidator(password);
        String expected_password = "very strong password.";

        assertEquals(expected_password,actual_password);
    }
    @Test
    void test_passwordValidator_Unknown(){

        String password = "";

        String actual_password = sol.passwordValidator(password);
        String expected_password = "unknown password strength.";

        assertEquals(expected_password,actual_password);
    }

}
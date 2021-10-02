import baseline.Solution27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    Solution27 sol = new Solution27();
    @Test
    void test_fistNameTwoCharactersTrue(){
        String fName = "Jimmy";

        boolean actualName = sol.firstNameTwoCharactersLong(fName);

        assertEquals(true,actualName);

    }
    @Test
    void test_fistNameTwoCharactersFalse(){
        String fName = "W";

        boolean actualName = sol.firstNameTwoCharactersLong(fName);

        assertEquals(false,actualName);

    }
    @Test
    void test_fistNameFilledTrue(){
        String fName = "Jimmy";

        boolean actualName = sol.firstNameFilled(fName);

        assertEquals(true,actualName);

    }
    @Test
    void test_fistNameFilledFalse(){
        String fName = "";

        boolean actualName = sol.firstNameFilled(fName);

        assertEquals(false,actualName);

    }
    @Test
    void test_zipCodeValidTrue(){
        String zipCode = String.valueOf(55555);

        boolean actualZipcode = sol.zipCodeValid(zipCode);

        assertEquals(true, actualZipcode);
    }
    @Test
    void test_zipCodeValidFalse() {
        String zipCode = String.valueOf(1);

        boolean actualZipcode = sol.zipCodeValid(zipCode);

        assertEquals(false, actualZipcode);
    }
    @Test
    void test_employeeIDTrue(){
        String employeeID = "AA-1234";

        boolean actualEmployeeID = sol.employeeIDValid(employeeID);

        assertEquals(true, actualEmployeeID);
    }
    @Test
    void test_employeeIDFalse(){
        String employeeID = "F3-KKFF";

        boolean actualEmployeeID = sol.employeeIDValid(employeeID);

        assertEquals(false, actualEmployeeID);
    }
   



}
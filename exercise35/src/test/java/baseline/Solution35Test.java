package baseline;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void test_nameWinnerAdds() throws NoSuchAlgorithmException {
      Solution35 sol = new Solution35();
        ArrayList<String> name = new ArrayList<String>();

        name.add("Jone");

        String expectedResult = name.get(0);
       assertEquals(expectedResult,name);



    }

}
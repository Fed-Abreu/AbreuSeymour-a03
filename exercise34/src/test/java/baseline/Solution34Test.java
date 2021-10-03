package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    Solution34 sol = new Solution34();
    @Test
    void test_employeeListShows(){
        ArrayList<String>employees = new ArrayList<>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));

        boolean b = employees.remove("Chris Smith");

        Assertions.assertEquals(false, b);




    }

}
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    @Test

    void test_CanDisplay() {
        List<Solution40> employeeList = new ArrayList<>();
        employeeList.add(new Solution40("John", "Johnson        ", "Manager             ", "2016-12-31"));
        employeeList.add(new Solution40("Tou", "Xiong           ", "Software Engineer   ", "2016-10-05"));
        employeeList.add(new Solution40("Michaela", "Michaelson ", "District Manager    ", "2015-12-19"));
        employeeList.add(new Solution40("Jake", "Jacobson       ", "Programmer          ", ""));
        employeeList.add(new Solution40("Jacquelyn", "Jackson   ", "DBA                 ", ""));
        employeeList.add(new Solution40("Sally", "Weber         ", "Web Developer       ", "2015-12-18"));

        assertTrue(employeeList.size() == 6);

        }

    }

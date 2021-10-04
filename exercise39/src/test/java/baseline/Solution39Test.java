package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    void test_SortingAndDisplaysCorrect(){
        List<Solution39> employeeList = new ArrayList<>();

        employeeList.add(new Solution39("John", "Johnson        ", "Manager             ", "2016-12-31"));
        employeeList.add(new Solution39("Tou", "Xiong           ", "Software Engineer   ", "2016-10-05"));
        employeeList.add(new Solution39("Michaela", "Michaelson ", "District Manager    ", "2015-12-19"));
        employeeList.add(new Solution39("Jake", "Jacobson       ", "Programmer          ", ""));
        employeeList.add(new Solution39("Jacquelyn", "Jackson   ", "DBA                 ", ""));
        employeeList.add(new Solution39("Sally", "Weber         ", "Web Developer       ", "2015-12-18"));

        employeeList.sort(new Solution39.LastNameSort());

        assertNotEquals(employeeList, Solution39.employees);
    }

}
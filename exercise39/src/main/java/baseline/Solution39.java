package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;

public class Solution39 {
    static TreeMap<Integer, Solution39> employees = new TreeMap<>();
    //Make Private String variables for firstName lastName Position and separationDate
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    // Then make constructor for variables
    public Solution39(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //Make get and set methods for variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparationDate(String separationDate) {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }
    //Compare Last Name
    public static class LastNameSort implements Comparator<Solution39> {
        public int compare(Solution39 o1, Solution39 o2) {
            return o1.getLastName().compareTo(o2.getLastName());

        }
    }

        public static void main(String[] args) {
            //Create an Array to make a new Employee
            List<Solution39> employeeList = new ArrayList<>();
            //add new Employee to list
            employeeList.add(new Solution39("John", "Johnson        ", "Manager             ", "2016-12-31"));
            employeeList.add(new Solution39("Tou", "Xiong           ", "Software Engineer   ", "2016-10-05"));
            employeeList.add(new Solution39("Michaela", "Michaelson ", "District Manager    ", "2015-12-19"));
            employeeList.add(new Solution39("Jake", "Jacobson       ", "Programmer          ", ""));
            employeeList.add(new Solution39("Jacquelyn", "Jackson   ", "DBA                 ", ""));
            employeeList.add(new Solution39("Sally", "Weber         ", "Web Developer       ", "2015-12-18"));

            //Sort by last name
            employeeList.sort(new LastNameSort());

            System.out.println("Name" + "                 |  " + "Position            |" + " Separation Date");
            System.out.println("---------------------|----------------------|----------------");

            //Display employee with correct table format

            for (Solution39 employ : employeeList) {
                System.out.print( employ.getFirstName() +" "+ employ.getLastName() +" | "+ employ.getPosition() + " | "+employ.separationDate +"\n");
            }

            //Make them in Employee




        }


}

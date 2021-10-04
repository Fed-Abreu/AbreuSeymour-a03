package baseline;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution40 {
    //Implment most of 39 here except print table
    static TreeMap<Integer, Solution40> employees = new TreeMap<>();
    //Make Private String variables for firstName lastName Position and separationDate
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;
    public Solution40(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //Make get and set methods for last name

    public String getLastName() {
        return lastName;
    }

    //Compare Last Name
    public static class LastNameSort implements Comparator<Solution40> {
        public int compare(Solution40 o1, Solution40 o2) {
            return o1.getLastName().compareTo(o2.getLastName());

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create an Array to make a new Employee
        List<Solution40> employeeList = new ArrayList<>();
        //add new Employee to list
        employeeList.add(new Solution40("John", "Johnson        ", "Manager             ", "2016-12-31"));
        employeeList.add(new Solution40("Tou", "Xiong           ", "Software Engineer   ", "2016-10-05"));
        employeeList.add(new Solution40("Michaela", "Michaelson ", "District Manager    ", "2015-12-19"));
        employeeList.add(new Solution40("Jake", "Jacobson       ", "Programmer          ", ""));
        employeeList.add(new Solution40("Jacquelyn", "Jackson   ", "DBA                 ", ""));
        employeeList.add(new Solution40("Sally", "Weber         ", "Web Developer       ", "2015-12-18"));


        //Sort by last name
        employeeList.sort(new LastNameSort());
        //Display Enter a search string: and Scan as String
        System.out.print("Enter a search String: ");
        String search = input.nextLine();


        //if the Scaned String contains employee Then Display employees
        System.out.println("Name" + "                 |  " + "Position            |" + " Separation Date");
        System.out.println("---------------------|----------------------|----------------");
        for(Solution40 solution40 : employeeList){
        if(solution40.firstName.contains(search) || solution40.lastName.contains(search)) {
            System.out.print(solution40.firstName + " " + solution40.lastName + " | "+solution40.position + " | "+solution40.separationDate + "\n");
        }
        }

    }


}

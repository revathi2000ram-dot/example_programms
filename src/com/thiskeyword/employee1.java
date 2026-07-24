package com.thiskeyword;

public class employee1 {

    // Attributes
    private int empId;
    private String name;
    private String designation;
    private double salary;
    private int performanceRating;

    // Parameterized Constructor
    public employee1(int empId, String name, String designation, double salary, int performanceRating) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    // Getter Methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    // Setter Methods
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Business Logic Method
    public void promoteEmployee() {

        if (performanceRating >= 4) {

            // Increase salary by 20%
            salary = salary + (salary * 20 / 100);

            // Promote to next level
            if (designation.equalsIgnoreCase("Trainee")) {
                designation = "Junior Developer";
            } else if (designation.equalsIgnoreCase("Junior Developer")) {
                designation = "Developer";
            } else if (designation.equalsIgnoreCase("Developer")) {
                designation = "Senior Developer";
            } else if (designation.equalsIgnoreCase("Senior Developer")) {
                designation = "Team Lead";
            } else if (designation.equalsIgnoreCase("Team Lead")) {
                designation = "Manager";
            } else {
                designation = designation + " (Promoted)";
            }

            System.out.println("Employee promoted successfully.");
        } else {
            System.out.println("No promotion. Performance rating is less than 4.");
        }
    }
}
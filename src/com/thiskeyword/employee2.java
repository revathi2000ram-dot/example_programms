package com.thiskeyword;

public class employee2 {

    public static void main(String[] args) {

        // Create Employee Object
        employee1 emp = new employee1(201, "revuu", "Developer", 50000.0, 5);

        // Display Employee Details Before Promotion
        System.out.println("Before Promotion:");
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: $" + emp.getSalary());
        System.out.println("Performance Rating: " + emp.getPerformanceRating());

        // Call Business Logic Method
        emp.promoteEmployee();

        // Display Employee Details After Promotion
        System.out.println("\nAfter Promotion:");
        System.out.println("New Designation: " + emp.getDesignation());
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
		
		

package com.makesh.oops;

public class EmployeeDetails {
    String name;
    int id;
    float Salary;
    String designation;
    public EmployeeDetails(float salary, int id, String name, String designation) {
        this.Salary = salary;
        this.id = id;
        this.name = name;
        this.designation = designation;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+Salary);
        System.out.println("Designation: "+designation);
    }
    public static void main(String[] args) {
        EmployeeDetails emp= new EmployeeDetails(12000.00f,123,"Makesh","Team Leader");
        emp.display();
    }
}

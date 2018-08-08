package com.teju.algorithms.comparator;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(){

    }

    public Employee(int id, String firstName, String lastName, double salary){
        this.id= id;
        this.firstname= firstName;
        this.lastname= lastName;
        this.salary  = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

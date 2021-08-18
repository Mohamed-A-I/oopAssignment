/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Mohamed
 */
public class Employee extends Person{
    String Department;

    public Employee(String Department, String Name, String Email) {
        super(Name, Email);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }
@Override
    public String getDescription() {
        return "employee Department"+Department;
    }
    
    
}

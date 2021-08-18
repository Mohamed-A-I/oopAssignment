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
public class Student extends Person{
    String courseGrade;

    public String getCourseGrade() {
        return courseGrade;
    }

    public Student(String courseGrade, String Name, String Email) {
        super(Name, Email);
        this.courseGrade = courseGrade;
    }
@Override
    public String getDescription() {
        return "The grade of student is"+courseGrade;
    }

    

    
}

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
public class PersonViewerTest {
    
    
    public static void main(String[] args) {
        PersonViewer pv=new PersonViewer();
        
        Student s1=new Student("A", "Mohamed", "m@gmail.com");
    Lecturer l1= new Lecturer("java", "ali", "a@gmail.com");
    Employee em1=new Employee("it", "said", "s@gmail.com");
        
        
        pv.view(s1);
        pv.view(l1);
        pv.view(em1);
    }
    
}

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
public class Lecturer extends Person{
    String subject;

    public Lecturer(String subject, String Name, String Email) {
        super(Name, Email);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
@Override
    public String getDescription() {
        return "Teaches Biology"+subject;
    }
    
    
}

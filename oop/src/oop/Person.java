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
public class Person {
    
    
    
    
    String Name,Email,Description;
    
    
        public Person(String Name, String Email) {
        this.Name = Name;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getDescription() {
        return Description;
    }


    
}

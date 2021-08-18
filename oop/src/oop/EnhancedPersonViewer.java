/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class EnhancedPersonViewer extends PersonViewer{
    static Student student[]=new Student[20];
    static Lecturer lecturer[]=new Lecturer[50];
    static Employee employee[]=new Employee[50];
    static  EnhancedPersonViewer epv=new EnhancedPersonViewer();
    static int sizeS=0,sizeL=0,sizeE=0;
    public static void main(String[] args) {
        MainMenu();
    }
    @Override
    public void view(Person p){
    if(p instanceof Student){epv.StudentView((Student)p);}
    else if (p instanceof Lecturer){epv.LecturerView((Lecturer)p);}
    else{epv.EmployeeView((Employee)p);}
    
    }
    
    
    public void StudentView(Student s){
    super.view(s);
    
    }
    
        public void LecturerView(Lecturer l){
    super.view(l);
    
    }
    
        public void EmployeeView(Employee e){
    super.view(e);
    
    }
    
    public static void MainMenu(){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("MainMenu \n"+       
"1- Student\n"+
"2- Lecturer\n"+
"3- Employee\n"+
"4- Exit\n" );
        
     System.out.println("enter your choice");
        int choose=input.nextInt();
        switch(choose){
            case 1:StudentMenu();break;
            case 2:LecturerMenu();break;
            case 3:EmployeeMenu();break;
            case 4:System.exit(0); break;
        
        
        }
        
        } 
    
    }
    
    
     public static void StudentMenu(){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println(
               " A) Add Student\n"+
"C) Calculate Averag\n"+
"D) Display Students\n"+
"R) Return the Menu\n");
        
     System.out.println("enter your choice");
        char choose=input.next().toUpperCase().charAt(0);
        switch(choose){
            case 'A':AddStudent(); break;
            case 'C':CalculateAverage(); break;
            case 'D':DisplayStudent();break;
            case 'R':return; 
        
        
        }
        
        } 
    
    }
    
   public static void  LecturerMenu(){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println(
 " A) Add Lecturer\n"+
"D) Display Lecturers\n"+
"R) Return the Menu\n");
        
     System.out.println("enter your choice");
        char choose=input.next().toUpperCase().charAt(0);
        switch(choose){
            case 'A':AddLecturer();break;
            case 'D':DisplayLecturer();break;
            case 'R':return; 
        
        
        }
        
        } 
    
    } 
    
public static void EmployeeMenu(){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println(
 " A) Add Employee\n"+
"C) Calculate yearly salary\n"+
"D)  Display Employees\n"+
"R) Return the Menu\n");
        
     System.out.println("enter your choice");
        char choose=input.next().toUpperCase().charAt(0);
        switch(choose){
            case 'A':AddEmployee();break;
            case 'C':Calculateyearlysalary(); break;
            case 'D':DisplayEmployee();break;
            case 'R':return; 
        
        
        }
        
        } 
    
    }    
    
    
    public static void AddStudent(){
    Scanner input=new Scanner(System.in);
    System.out.println("------------Add Student-------------");
    System.out.println("enter name");
    String Name=input.nextLine();
    
    System.out.println("enter email");
    String Email=input.nextLine();
    
    System.out.println("enter course grade");
    String grade=input.nextLine();
    
    student[sizeS]=new Student(grade, Name, Email);
    sizeS++;
    }
    
    
    
   public static void AddLecturer(){
    Scanner input=new Scanner(System.in);
    System.out.println("------------Add Lecturer-------------");
    System.out.println("enter name");
    String Name=input.nextLine();
    
    System.out.println("enter email");
    String Email=input.nextLine();
    
    System.out.println("enter subject");
    String subject=input.nextLine();
    
    lecturer[sizeL]=new Lecturer(subject, Name, Email);
    sizeL++;
    } 
   
   
      public static void AddEmployee(){
    Scanner input=new Scanner(System.in);
    
    System.out.println("------------add employee-------------");
    System.out.println("enter name");
    String Name=input.nextLine();
    
    System.out.println("enter email");
    String Email=input.nextLine();
    
    System.out.println("enter Department");
    String Department=input.nextLine();
    
    employee[sizeE]=new Employee(Department, Name, Email);
    sizeE++;
    } 
    
    
    
    
    
   public static void  DisplayStudent(){
    System.out.println("------------Display Student-------------");
   for (int i=0;i<sizeS;i++){
   epv.view(student[i]);
   
   
   }
   
   
   }
    

  
  
   public static void  DisplayLecturer(){
   System.out.println("------------Display Lecturer-------------");
   
      for (int i=0;i<sizeL;i++){
   epv.view(lecturer[i]);
   
   
   }
   
   }
   
   
     public static void  DisplayEmployee(){
   System.out.println("------------Display employee-------------");
      for (int i=0;i<sizeE;i++){
   epv.view(employee[i]);
   
   
   }
   
   
   }
   
   
     
     public static void CalculateAverage(){
     System.out.println("------------CalculateAverage-------------");
     Scanner input=new Scanner(System.in);
     System.out.println("enter number mark");
     int no=input.nextInt();
     double sum=0;
     
     for(int i=1;i<=no;i++){
     System.out.println("enter mark"+i+":");
     sum+=input.nextInt();
     
     }
     System.out.println("average is :"+(sum/no));
     }
     
      public static void Calculateyearlysalary(){
      System.out.println("------------Calculateyearlysalary-------------");
     Scanner input=new Scanner(System.in);
     System.out.println("enter month salary");
     
     double salary=input.nextDouble();
      System.out.println("yearly salary :"+(12*salary));
     
     
     }
     
    
}

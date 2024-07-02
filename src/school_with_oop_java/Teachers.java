/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_with_oop_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fathy
 */
public class Teachers extends Person {
    static int size = 5;
    String[] Subject=new String[size];
    static ArrayList<Teachers>teachersArr=new ArrayList<>();    
    public Teachers(){}
    
    public Teachers(String[] subject,String name,int age,String address,String gender)
    {
    super(name, age, address, gender);
    this.Subject = subject;
    }
    public void SetSubjest(String[] subject)
    {
    for(int i=0;i<size;i++)
    {
    this.Subject[i]=subject[i];
    }
    }
    public String[] GetSubject()
    {
    return Subject;
    }
    public static void addTeacher(){
        Scanner input = new Scanner(System.in);
  
    
    try{
    int _size;
    System.out.print("Enter the TeacherSize = ");
    _size = input.nextInt();
    for(int i=0;i<_size;i++){
          Teachers timpTeacher = new Teachers();
    String teacherName;
        System.out.print("Enter The Name = ");
        teacherName = input.next();
        timpTeacher.SetName(teacherName);
    
    int TeacherAge;
        System.out.print("Enter The Age = ");
        TeacherAge = input.nextInt();
        timpTeacher.SetAge(TeacherAge);
    
    String TeacherAddress;
        System.out.print("Enter The Address = ");
        TeacherAddress = input.next();
        timpTeacher.SetAddress(TeacherAddress);
    
    String TeacherGender;
        System.out.print("Enter Gender = ");
        TeacherGender = input.next();
        timpTeacher.SetGender(TeacherGender);
        
    String[] TeacherSubject = new String[size];
    for(int j=0;j<TeacherSubject.length;j++)
    {
        System.out.print("Enter The Subjects "+ (j+1) +" = ");
        TeacherSubject[j] = input.next();
        
    }
    timpTeacher.SetSubjest(TeacherSubject);
    
    teachersArr.add(i,timpTeacher);
    
        System.out.println("================");
    }
    }catch(Exception f){
    System.out.println("Sorry I don't understand this ");
    }
      }
    public static void PrintTeacher()
    {
        try{
        
        for(int i=0;i<teachersArr.size();i++)
        {
            //Teachers t= teachersArr.get(i);
            System.out.println("The name is : "+teachersArr.get(i).GetName());
            System.out.println("The Age is : "+teachersArr.get(i).GetAge());
            System.out.println("The Address is : "+teachersArr.get(i).GetAddress());
            System.out.println("The Gender is : "+teachersArr.get(i).GetGender());
            for(int f=0;f<5;f++)
            {
            System.out.println("The Subjects is : "+teachersArr.get(i).GetSubject()[f]); 
            }
            System.out.println("==========================");
        }
        }
        catch(Exception e)
        {
            System.out.println("Sorry, the print order is incorrect for Teachers");
        
        }
        
    }
    
    
}

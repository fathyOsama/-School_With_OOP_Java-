/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_with_oop_java;
import java.util.Scanner;
import java.util.InputMismatchException;

import java.util.ArrayList;

/**
 *
 * @author Fathy
 */
public class Students extends Person {
    String Building_Number;
   // ArrayList<String>Degrees = new ArrayList<String>();
   static int size=5;
    int[]Degrees = new int[size]; 
   static ArrayList<Students> studentArr=new ArrayList<>();

    
    public Students()
    {
    }
    public Students(String name,int age,String address,String gender,String building_number,int[] degrees)
    {
        super(name, age, address, gender);
    this.Building_Number = building_number; 
    this.Degrees = degrees;
    }
    
    public void SetBuilding_Number(String building_number)
    {
    this.Building_Number = building_number;
    }
    public String GetBuilding_Number()
    {
    return Building_Number;
    }
    public void SetDegrees(int[] degrees)
    {
    for(int i=0;i<size;i++)
    {
    this.Degrees[i]=degrees[i];
    }
    }
    public int[] GetDegrees()
    {
     return Degrees;     
    }
    
   
    public static void AddStudents(){
        Scanner input = new Scanner(System.in);
        
        try{
    int StudentSize;
    System.out.print("Enter the StudentSize = ");
    StudentSize = input.nextInt();
    for(int i=0;i<StudentSize;i++)
    {
    Students TimpStudent =new Students();
    
    String StudentName;
    System.out.print("Enter The StudentName = ");
    StudentName = input.next();
    TimpStudent.SetName(StudentName);
    
    int StudentAge;
    System.out.print("Enter The StudentAge = ");
    StudentAge = input.nextInt();
    TimpStudent.SetAge(StudentAge);
    
    String StudentAddress;
    System.out.print("Enteh the Address = ");
    StudentAddress = input.next();
    TimpStudent.SetAddress(StudentAddress);
    
    
    String StudentGender;
    System.out.print("Enter The Gender = ");
    StudentGender = input.next();
    TimpStudent.SetGender(StudentGender);
    
    
    String StudentBuilding_Number;
    System.out.print("Enter The StudentBuilding_Number = ");
    StudentBuilding_Number = input.next();
    TimpStudent.SetBuilding_Number(StudentBuilding_Number);
    
    int[] StudentDegrees =new int[size];
    for(int f=0; f<4;f++)
    {
        System.out.print("Enter the StudentDegrees "+ (f+1)+" = ");
        StudentDegrees[f]=input.nextInt();
    }
    TimpStudent.SetDegrees(StudentDegrees);
    studentArr.add(TimpStudent);
        System.out.println("======================");
    }
    }  catch(Exception e)
        {
          System.out.println("Sorry I don't understand this ");
        }
        
    }

    public static void PrintStudent()
    {
        try{
      for(int i=0;i<studentArr.size();i++)
      {
           System.out.println("The Name is : "+studentArr.get(i).GetName());
           System.out.println("The Age is : "+studentArr.get(i).GetAge());
           System.out.println("The Address is : "+studentArr.get(i).GetAddress());
           System.out.println("The Gender is : "+studentArr.get(i).GetGender());
           System.out.println("The Building_Number is : "+studentArr.get(i).GetBuilding_Number());
           for(int j=0;j<4;j++)
             {
               System.out.println("The Degrees is : "+studentArr.get(i).GetDegrees()[j]);

             }

      }
        }
        catch(Exception e)
        {
            System.out.println("Sorry, the print order is incorrect for Students");
        }
      }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_with_oop_java;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Fathy
 */
public class Operation{
    

    public static void addOperation(){ 
        Scanner input = new Scanner(System.in);

        String[] userName={"Fathey","Osama","Shehab","Ismel"};
        System.out.print("Enter the UserName Person : ");
        String usernamePerson;
        usernamePerson = input.next();
        
        int[] password={123,345,567,789};
        System.out.print("Enter The Password person  : ");
        int passwordperson;
        passwordperson = input.nextInt();
        boolean isUser = false;
        for(int i=0;i<4;i++)
        {
            if(userName[i] == usernamePerson | password[i] == passwordperson)
               {

                  isUser = true;
               }
            else{ 
                System.out.println("================");
                
                break;
            
            }
        }
    if(isUser){
             while(true){
        
                 System.out.println(" The AddStudent pressure (1)");
                 System.out.println(" The AddTeacher pressure (2)");
                 System.out.println(" The printStudent pressure (3)");
                 System.out.println(" The printTeacher pressure (4)");
                 System.out.println(" if want to exit press number (5)");
                 int choose;
                 choose = input.nextInt();
                 if(choose == 1)
                 {
                  Students.AddStudents();
                 }
                 else if(choose == 2)
                 {
                  Teachers.addTeacher();
                 }
                  else if(choose == 3)
                 {
                 Students.PrintStudent();
                 }
                  else if(choose == 4)
                 {
                 Teachers.PrintTeacher();
                 }
                 else
                 {
                  break;
                 }
                       }
            }

  }
 

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_with_oop_java;

/**
 *
 * @author Fathy
 */
public class Person {
    String Name;
    int Age;
    String Address;
    String Gender;
    
    public Person()
    {}
    public Person(String name,int age,String address,String gender)
    {
    this.Name = name;
    this.Age = age;
    this.Address = address;
    this.Gender = gender;
    }
    public void SetName(String name)
    {
    this.Name =name;
    }
    public String GetName()
    {
    return Name;
    }
    public void SetAge(int age)
    {
    this.Age =age;
    }
    public int GetAge()
    {
    return Age;
    }
    public void SetAddress(String address)
    {
    this.Address = address;
    }
    public String GetAddress()
    {
    return Address;
    }
    public void SetGender(String gender)
    {
        this.Gender = gender;
    }
    public String GetGender()
    {
    return Gender;
    }
    
}
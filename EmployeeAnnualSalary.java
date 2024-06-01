/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a class User
class User{
    int id;
    String name;
//   Parametrized Constructor
    public User(int i,String n){
        id=i;
        name=n;
    }
 }
//Defining a class Employee which inherits class User
class Employee extends User{
    double salary;
//   Parametrized Constructor
    public Employee(int i, String n,double s) {
        super(i, n);
        salary=s;
        
    }
//    Method to Calculate Annual Salary of Employee
    public void CalculateAnnualSalary(){
        salary=salary*12;
    }
//    Methos to display the name,id,salary of Employee
    public void Display(){
        System.out.println("The name of Employee is "+name);
        System.out.println("The id of Employee is "+id);
        System.out.println("Annual salary of "+ name +" is Rs. "+salary);
    }
  }
//Defining a class EmployeeAnnualSalary
public class EmployeeAnnualSalary{
    public static void main(String[] args) {
//        Creating Object of Employee
        Employee e=new Employee(01,"Ankit",40000);
        e.CalculateAnnualSalary();
        e.Display();
        
    }
    
}

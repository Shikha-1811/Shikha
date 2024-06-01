
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a class LeapYear
class  LeapYear{
//declaration of member variable    
private int year;
//constructor
public LeapYear(){
    System.out.println("Enter year that uu want to check it is leapyear or not");
    Scanner sc=new Scanner(System.in);
    year=sc.nextInt();
    System.out.println("-----------------------------");
}
//method to check leapyear
public void checkLeapYear(){
    if(year<0){
        System.out.println("It is invalid year");
    }
    else{
    if(year%4==0 && year%100!=0){
        System.out.println(year+" is leap year");
    }
    else{
        System.out.println(year+" is not leap year");
    
    }
}
}
}
//defining a class IsLeapYear
public class IsLeapYear {
    public static void main(String[] args) {
//      Creating object of LeapYear
        LeapYear l=new LeapYear();
        l.checkLeapYear();
        }
    
}

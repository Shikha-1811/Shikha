
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a Class to find out maximum no between the two no
class MaxNo{
//    Member Variable declaration  
int  num1,num2; //num1 will store first no and num2 will store second no
//---------------------------------------------------------------------------
//method to receive input through keyboard
public void input()
{
//  Creating Object of Scanner
    System.out.println("Enter first no");
    Scanner sc=new Scanner(System.in);
    num1=sc.nextInt();
    System.out.println("Enter second no");
    num2=sc.nextInt();
}
//method to compare two no.s
public void compareno(){
    if(num1>num2){
        System.out.println(num1+ " is greater than "+ num2);
    }
    else{
        System.out.println(num2+ " is greater than "+ num1);
    }
}
}
public class Find_Max_no {
    public static void main(String[] args) {
//      Creating object of Maxno Class
        MaxNo m=new MaxNo();
        m.input();
        m.compareno();
        
    }
}


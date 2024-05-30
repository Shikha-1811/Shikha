/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a class Bank
class BANK{
//    member variable declaration
//--------------------------------------
//Constructor    
private double amount;
public BANK(){
this.amount=10000;
}
//method to withdraw from account
public void withdraw(double withdrawlamount){
    String message=(withdrawlamount<=amount)?"Withdrawl Successfull" : "Insufficient balance";
    System.out.println(message);
    if(withdrawlamount<=amount){
    amount=amount-withdrawlamount;
    }
}
//method to deposit into the account
public void deposit(double depositamount){
    amount=amount+depositamount;
}
//method to display the total balance
public void displayBalance(){
    System.out.println("Total Balance : "+amount);
}
}
public class ques1_Bank {
    public static void main(String[] args) {
//        Creating object of BANK class
        BANK b=new BANK();
//        b.withdraw(2000);
        b.deposit(5000);
        b.displayBalance();
        
    }
}


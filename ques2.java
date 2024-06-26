/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a Superclass
class Animal{
    //method
    public void makesound(){
        System.out.println("The animal makes a sound");
    }
}
//Defining a sublass that extends superclass
class Dog extends Animal{
    //method overriding
    public void makesound(){
        System.out.println("The dog barks");
    }
}
//Defining a sublass that extends superclass
class Cat extends Animal{
    //method overriding
    public void makesound(){
        System.out.println("The cat meows");
    }
}
// deefining a class ques2
public class ques2 {
    public static void main(String[] args) {
     //creating of object   
        Animal a = new Animal();
        a.makesound();
        
        Dog d = new Dog();
        d.makesound();
        
        Cat c = new Cat();
        c.makesound();
    }
    
}

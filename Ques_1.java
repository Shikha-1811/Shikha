/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chunni pal
 */
//Defining a Superclass
class HillStations{
    //method 
    public void location(){
        System.out.println("HillStations are located in the mountains");
    }
    //method
    public void famousFor(){
        System.out.println("Hill Stations are famous for scenic beauty");    
    }
 }
// Defining a subclass that extends superclass
class Manali extends HillStations{
    //method overriding
    public void location(){
        System.out.println("Manali is located in the Himalaya");
    }
    //method overriding
    public void famousFor(){
        System.out.println("Manali is famous for its apple orchads and adventure sports");
    }
}
// Defining a subclass that extends superclass
class Mussoorie extends HillStations{
    public void location(){
        System.out.println("Mussorie is located in the Shivalik");
    }
     public void famousFor(){
        System.out.println("Manali is famous for its apple colonial-era architecture and scenic views");
    }
}
// Defining a subclass that extends superclass
class Gulmarg extends HillStations{
    //method overriding
    public void location(){
        System.out.println("Mussorie is located in the Kashmir");
    }
    //method overriding
    public void famousFor(){
        System.out.println("Manali is famous for its ski resorts and meadows");
    }
}
//Defining a class Ques_1
public class Ques_1 {
    public static void main(String[] args) {
    //creating of object of superclass
        HillStations hs= new HillStations();
        hs.location();
        hs.famousFor();
        
   //creating of object of subclass
        Manali m=new Manali();
        m.location();
        m.famousFor();
        
        
     //creating of object of subclass
        Mussoorie mu=new Mussoorie();
        mu.location();
        mu.location();
        
     //creating of object of subclass   
        Gulmarg gu=new Gulmarg();
        gu.location();
        gu.location();
    }
    
}

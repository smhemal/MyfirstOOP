/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstoop1;

/**
 *
 * @author MERC-LAB-01
 */
public class MyFirstOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car();
            c1.colour = "Red";
            c1.number = " WP CAT 5059";
            c1.EngineCapcity = 1500;
            c1.Model = "Toyota";
        Driver d1 = new Driver();
            d1.name = "Niluka";
            d1.age = 41;
        
        Car c2 = new Car();
        c2.colour = "Blue";
        c2.number = "WP CAR 8330";
        c2.EngineCapcity = 800;
        c2.Model = "Reynault";
        Driver d2 = new Driver();
            d2.name = "Saman";
            d2.age = 35;
            
          c1.driver = d1;
          c2.driver = d2;
            
        System.out.println("The colour of " + c1.Model + c1.number + " is " + c1.colour);
        System.out.println("The " + c1.Model + c1.number + " is driven by " + c1.driver.name);
        System.out.println("The " + c1.driver.name + " can drive either " + c1.Model + " or " + c2.Model);
        
            
           
              
        
     }
    
}

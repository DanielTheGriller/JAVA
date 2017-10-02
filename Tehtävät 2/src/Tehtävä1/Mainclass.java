/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tehtävä1;

/**
 *
 * @author TehoGrilli
 */
public class Mainclass {

   
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println("Hei, nimeni on " + dog.getName() + "!");
        dog1.setDog("Musti", "Vuh!");
        System.out.println("Hei, nimeni on " + dog1.getName() + "!");
        System.out.println(dog.getSpeak());
        System.out.println( dog1.getSpeak());
        
        
    }
    
}

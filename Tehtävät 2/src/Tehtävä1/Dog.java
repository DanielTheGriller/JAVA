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
public class Dog {
    private String name;
    private String speak;
    
    public Dog(){
        name = "Rekku";
        speak = "Hau!";
    }
    
    public Dog(String new_name, String new_speak){
        name = new_name;
        speak = new_speak;
    }
    public String getName(){return name;}
    public String getSpeak() {return speak;}
     
    public void setDog(String new_name, String new_speak) {name = new_name; speak = new_speak;}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotapp;
/**
 *
 * @author Cody Schafer
 */
public class Food {
    //fields
  
    private double weight;
    private String name;

    //constructor
    public Food(String name, int weight){
        this.weight = weight;
        this.name = name;
    }
    
    //getters / setters
        
    
    
    //methods   
        //none rn

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    }


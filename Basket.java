/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotapp;

/**
 *
 * @author Cody S.
 */
public class Basket {
    Food apple; //1
    Food pizza; //2
    Food bagel; //3
    Food burger; //4
    
    
    //constructor
    public Basket(){
        apple = new Food("apple",1);
        pizza = new Food("pizza",3);
        bagel = new Food("bage",2);
        burger = new Food("burger",5);
    }
}

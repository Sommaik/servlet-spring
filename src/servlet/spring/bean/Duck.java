/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.bean;
import servlet.spring.interfaces.CanFly;
import servlet.spring.interfaces.CanSwim;

/**
 *
 * @author sommaik
 */
public class Duck extends Animal implements CanFly, CanSwim {

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
      System.out.println("Duck can swim");  
    }
    
}

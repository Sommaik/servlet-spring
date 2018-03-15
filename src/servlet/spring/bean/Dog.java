/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.bean;

/**
 *
 * @author sommaik
 */
public class Dog extends Mamal {

    @Override
    public void feed() {
        System.out.println("dog feed");
    }
    
}

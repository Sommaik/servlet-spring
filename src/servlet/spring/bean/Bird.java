/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.bean;

import servlet.spring.interfaces.CanFly;

/**
 *
 * @author sommaik
 */
public class Bird extends Animal implements CanFly {

    @Override
    public void fly() {
        System.out.println("Bird Can Fly....");
    }
    
}

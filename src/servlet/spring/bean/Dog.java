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
    
    private String name;
    private final int leg = 4;
    
    public Dog(){
       this.setName("no name");
    }
    
    public Dog(String name){
        this.setName(name);
    }

    @Override
    public void feed() {
        System.out.println("dog feed");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + '}';
    }
    
}

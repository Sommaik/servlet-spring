/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring;

/**
 *
 * @author sommaik
 */
public class Kyle {
    
//    Kyle(){}
//  
    public static String prefix = "Hello";
    
    String name;
    
    Kyle(String name){
        this.name = name;
        this.hello();
    }
    
    public String sayHello(){
        return "Hello "+this.name;
    }
    
    public void hello(){
        System.out.println(
                "Local say hello "+this.name
        );
    }
    
}

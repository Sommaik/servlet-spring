/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring;

import servlet.spring.bean.Animal;
import servlet.spring.bean.Bird;
import servlet.spring.bean.Cat;
import servlet.spring.bean.Circus;
import servlet.spring.bean.Mamal;
import servlet.spring.bean.Dog;
import servlet.spring.bean.Duck;
/**
 *
 * @author sommaik
 */
public class ServletSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Kyle k = new Kyle("John");
//        System.out.println(k.sayHello());
        
//        Kyle[] arr;
//        arr = new Kyle[2];
//        arr[0] = new Kyle("John");
//        arr[1] = new Kyle("Jimmy");
//        
//        System.out.println(arr[0].sayHello());
//        
//        System.out.println(Kyle.prefix);
//        
//        String str = new String("ABCDEFG");
//        
//        System.out.println(str.substring(0, 3));
        
//          Animal a = new Animal();
//          Animal c = new Cat();
//          
//          System.out.println(a.say());
//          System.out.println(c.say());
//          
//          ((Cat)c).walk();
          
//          Mamal m = new Dog();
//          m.feed();
//          System.out.println( m.say() );
//          
//          Mamal c = new Cat();
//          c.feed();
          
          Duck d = new Duck();
          Bird b = new Bird();
          Circus c = new Circus();
          c.showFlyAnimal(d);
          c.showFlyAnimal(b);
        
    }
    
}

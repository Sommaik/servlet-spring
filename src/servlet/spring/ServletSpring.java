/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import servlet.spring.bean.Dog;
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
          
//          Duck d = new Duck();
//          Bird b = new Bird();
//          Circus c = new Circus();
//          c.showFlyAnimal(d);
//          c.showFlyAnimal(b);

//            java.util.List<Duck> ducks = new ArrayList();
//            
//            for(int i = 0; i<10; i++){
//                ducks.add(new Duck());
//            }
//            
//            System.out.println(ducks.size());
//            ducks.get(9).fly();
//            ducks.remove(0);
//            
//            System.out.println(ducks.size());
//            ducks.get(9).fly();
////            ((Duck)ducks.get(10)).fly();

        Map<String, Dog> dogs = new HashMap<>();
        
        String[] dogName = new String[]{ "Jimmy", "Johny", "Jame", "Indy" };
        
        for(int i=0; i<dogName.length; i++){
            dogs.put( dogName[i], new Dog(dogName[i]));
            System.out.println( dogs.get(dogName[i]) );
        }
        try{
            InputStream fis = new FileInputStream(
                "/Users/sommaik/NetBeansProjects/servlet-spring/.gitignore"
            );
            InputStreamReader bis = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(bis);
            do {
              System.out.println(  
                  br.readLine() 
              );  
            }while(br.ready());
            
        }catch(FileNotFoundException fno){
            fno.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(ServletSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

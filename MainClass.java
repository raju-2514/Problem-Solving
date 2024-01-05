/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.reflect.Method;

/**
 *
 * @author Raju
 */
public class MainClass {
    public static void main(String[] args) {
            Person p=new Person();
    Class c=p.getClass();
    String name=c.getName();
        System.out.println("class name"+name);
        
        Method methods[]=c.getDeclaredMethods();

        for(Method m:methods){
            System.out.println("method name:"+m.getName());
            System.out.println("method name:"+m.getName());
        }
        Class superclass=c.getSuperclass();
        System.out.println("Superclass Name :"+superclass.getName());
    }

    
}

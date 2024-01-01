/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add
{
    
    public void add (int ... s){
        int sum =0;
        String addition ="";
        int count =0;
        for (int i : s){
            if (count  ==0)
            {
                addition = addition +i;
            }else
            {
                addition =  addition +"+" + i; 
            }


            sum +=i;
           count ++ ;
        }
        System.out.println(addition+"="+sum);
    }
    
}


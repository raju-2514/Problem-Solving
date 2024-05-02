package hackerrank;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionProblem {

        public static void main(String[] args){
            Class<Student> student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method : methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
    }


package hackerrank.patttern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    // Regular expression pattern for validating an IP address
    String pattern = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
}
//Write your code here

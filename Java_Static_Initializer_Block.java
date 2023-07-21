package HackerRank;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static  int a;
    static int b;
    static boolean flag;
    static {
        Scanner scan=new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();
        
    }
    public static void main(String[] args) {



        if(a>0 && b>0)
        {
            if(a>b)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }

    }
}

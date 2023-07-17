package HackerRank;

import java.util.Scanner;

public class loop2 {
    public static int calculate(int a, int b, int n)
    {
        int sum=a;

        for(int q=n;q>=0;q--)
        {
            sum=sum+((int)Math.pow(2, q))*b;
        }
        return sum;
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int a = 0,b = 0,n = 0,t=0;
         t=in.nextInt();

        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                System.out.print(calculate(a,b,j)+" ");
            }
            System.out.println();
        }
    }
}


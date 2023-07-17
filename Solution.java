package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static int simpleArraySum(int ar[])
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int a=in.nextInt();
        int ar[] = new int[a];
        System.out.println("Enter th"+a+" value of array :");

        for(int i=0;i<a;i++)
        {

            ar[i]=in.nextInt();
        }

        System.out.println(Solution.simpleArraySum(ar));
    }
}

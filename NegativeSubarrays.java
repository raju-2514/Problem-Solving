package HackerRank_CP;

import java.util.Scanner;

public class NegativeSubarrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int myArray[]=new int[n];
        for (int i=0;i<n;i++)
        {
        myArray[i]=scan.nextInt();
        }
      int count=0;

        for (int i=0;i<n;i++)
        {
            int arraySum=0;
            for(int j=i;j<n;j++)
            {
                arraySum+=myArray[j];
                if(arraySum<0)
                {
                    count++;
                }
            }

        }

        System.out.println(count);
        scan.close();
    }
}

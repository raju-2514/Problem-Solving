package HackerRank_CP;

import java.util.Scanner;

public class Array_1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        for(int j=0;j<n;j++)
        {
            myArray[j]=scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}

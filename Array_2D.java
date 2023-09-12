package HackerRank_CP;

import java.util.Scanner;

public class Array_2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];

        // Input the 2D array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Initialize the maximum sum to a very small value
        int maxSum = Integer.MIN_VALUE;
        System.out.println(maxSum);
        // Iterate through the array to find the maximum hourglass sum
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // Update the maximum sum if a larger hourglass sum is found
                if (hourglassSum > maxSum) {
                    maxSum = hourglassSum;
                }
            }
        }

        // Print the maximum hourglass sum
        System.out.println(maxSum);

        scanner.close();
    }
}

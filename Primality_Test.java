package HackerRank_CP;

import java.math.BigInteger;
import java.util.Scanner;

public class Primality_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
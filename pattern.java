package HackerRank_CP;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
         String pattern = "^(\\d{1,3}\\.){3}\\d{1,3}$";
        Scanner scan=new Scanner(System.in);
        String[] testCases = {
                "000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP"
        };

        for (String testCase : testCases) {
            boolean isValid = testCase.matches(pattern);
            System.out.println(isValid);
        }
    }
}

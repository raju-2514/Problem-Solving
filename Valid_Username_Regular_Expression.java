package HackerRank_CP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Username_Regular_Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUsernames = Integer.parseInt(scanner.nextLine());

        String regex = "^[a-zA-Z]\\w{5,29}$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numUsernames; i++) {
            String username = scanner.nextLine();
            Matcher matcher = pattern.matcher(username);

            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();


    }
}

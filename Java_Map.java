package HackerRank_CP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Java_Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Create a phone book using a HashMap
        Map<String, String> phoneBook = new HashMap<>();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Process queries until end-of-file
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();

    }
}

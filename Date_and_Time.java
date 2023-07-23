package HackerRank;

import java.util.Calendar;
import java.util.Scanner;

public class Date_and_Time {
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the year, month (0-based), and day
        calendar.set(year, month-1, day);

        // Get the day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the numeric representation of the day to the corresponding string representation
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return daysOfWeek[dayOfWeek-1];
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month= scanner.nextShort();
        int day= scanner.nextInt();
        int year= scanner.nextInt();
        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek); // Output: WEDNESDAY
    }
}
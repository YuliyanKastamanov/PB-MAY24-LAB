package ConditionalStatementsAdvance;

import java.util.Scanner;

public class WeekendOrWorkingDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();


        switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}

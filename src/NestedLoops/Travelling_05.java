package NestedLoops;

import java.util.Scanner;

public class Travelling_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        //докато не получим команда "End" -> прочитаме нова дестинация
        while (!destination.equals("End")){

            //Greece -> 1000
            double neededMoney = Double.parseDouble(scanner.nextLine());

            double budget = 0;
            //докато необходимите пари за екскурзията са по-големи от нашия бюджет -> събираме пари
            while (neededMoney > budget){
                double currentMoney = Double.parseDouble(scanner.nextLine());
                budget += currentMoney;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}

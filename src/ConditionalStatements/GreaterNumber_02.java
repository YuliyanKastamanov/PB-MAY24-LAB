package ConditionalStatements;

import java.util.Scanner;

public class GreaterNumber_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        //Проверяваме дали number1 > number2
            //true-> принтираме number1
            //false-> принтираме number2

        if (number1 > number2) {
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }

    }
}
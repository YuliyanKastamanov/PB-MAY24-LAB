package ConditionalStatements;

import java.util.Scanner;

public class ExcellentResult_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());//прочитаме оценка от конзолата

        //Проверяваме дали оценката е >= 5 -> ако е вярно принтираме "Excellent!"
        if(grade >= 5){
            System.out.println("Excellent!");
        }


    }
}

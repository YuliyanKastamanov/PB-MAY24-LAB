package ConditionalStatementsAdvance;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //ако е в диапазона [100…200] или е 0
        boolean isValid = number >= 100 && number <= 200 || number == 0;

        // ако булевата променлива е различна от true -> числото не е в диапазона от 100 до 200 или е различно от нула
        if(!isValid){
            System.out.println("invalid");
        }
    }
}

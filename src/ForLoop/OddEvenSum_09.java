package ForLoop;

import java.util.Scanner;

public class OddEvenSum_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= countNumbers * 2 ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if(i <= countNumbers){
                sumLeft += currentNumber;
            }else {
                sumRight += currentNumber;
            }
        }

        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d", sumLeft);
        }else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", diff);
        }
    }
}

package WhileLoop;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();//"234"

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")){

            int currentNumber = Integer.parseInt(input);// "-2147483647" -> int -2147483647

            if(currentNumber > maxNumber){
                maxNumber = currentNumber;// maxNumber = -2147483647
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}

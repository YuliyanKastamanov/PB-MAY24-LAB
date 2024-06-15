package WhileLoop;

import java.util.Scanner;

public class Sequence2K1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numberToPrint = 1;

        while (numberToPrint <= n){
            System.out.println(numberToPrint);

            numberToPrint = numberToPrint * 2 + 1;
        }
    }
}

package ForLoop;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //буква	    a	e	i	o	u
        //стойност	1	2	3	4	5

        int sum = 0;

        for (int index = 0; index < input.length(); index++) {
            char symbol = input.charAt(index);
            switch (symbol) {
                case 'a' -> sum += 1; // sum = sum + 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }

        System.out.println(sum);

    }
}

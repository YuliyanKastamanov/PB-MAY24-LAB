package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());//началото на интервала от числа
        int secondNumber = Integer.parseInt(scanner.nextLine());//края на интервала от числа
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;

        boolean flag = false;//при намиране на правилна комбинация променяме стойността на true

        for (int i = firstNumber; i <=secondNumber ; i++) {

            for (int j = firstNumber; j <= secondNumber ; j++) {

                int currentCombination = i + j;
                countCombination ++;

                if (currentCombination == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i, j, magicNumber);
                    flag = true;
                    break;
                }

            }

            if (flag){
                break;
            }

        }

        if (!flag){
            System.out.printf("%d combinations - neither equals %d", countCombination, magicNumber);
        }
    }
}

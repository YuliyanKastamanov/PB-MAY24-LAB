package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //Когато делим целочислено / -> цяло число
        //Когато делим с остатък % -> остатъка от делението
        //когато търсим четно число използваме израза (number % 2 == 0) -> получаваме дали number е четно число
        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}

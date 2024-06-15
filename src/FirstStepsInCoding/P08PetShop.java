package FirstStepsInCoding;

import java.util.Scanner;

public class P08PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDogPacks = Integer.parseInt(scanner.nextLine());
        int countCatPacks = Integer.parseInt(scanner.nextLine());

        double priceForDogs = countDogPacks * 2.50;
        double priceForCats = countCatPacks * 4;

        double finalSum = priceForCats + priceForDogs;

        System.out.println(finalSum + " lv.");

    }
}

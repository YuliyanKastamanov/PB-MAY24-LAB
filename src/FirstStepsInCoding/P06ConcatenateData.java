package FirstStepsInCoding;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        //%s , %d, %f, %c


        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}

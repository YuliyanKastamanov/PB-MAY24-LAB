package ConditionalStatementsAdvance;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
       /*
        if(age >= 16){
            if(gender.equals("m")){
                System.out.println("Mr.");
            } else if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }else {
            if(gender.equals("m")){
                System.out.println("Master.");
            } else if (gender.equals("f")) {
                System.out.println("Miss.");
            }
        }*/
    }
}

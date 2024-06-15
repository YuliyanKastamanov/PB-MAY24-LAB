package ConditionalStatementsAdvance;

import java.util.Scanner;

public class SmallShop_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        //coffee	water	beer	sweets	peanuts
/* Sofia  0.50	    0.80	1.20	1.45	1.60
Plovdiv	  0.40	    0.70	1.15	1.30	1.50
Varna	   0.45	    0.70	1.10	1.35	1.55*/


        double totalPrice = 0;
        switch (product){
            case "coffee":
                if (town.equals("Sofia")) {
                    totalPrice = quantity * 0.50;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = quantity * 0.40;
                } else if (town.equals("Varna")) {
                    totalPrice = quantity * 0.45;
                }
                break;

            case "water":
                if(town.equals("Sofia")){
                    totalPrice = quantity * 0.80;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = quantity * 0.70;
                } else if (town.equals("Varna")) {
                    totalPrice = quantity * 0.70;
                }
                break;

            case "beer":
                if (town.equals("Sofia")){
                    totalPrice = quantity * 1.20;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = quantity * 1.15;
                } else if (town.equals("Varna")) {
                    totalPrice = quantity * 1.10;
                }
                break;

            case "sweets":
                if (town.equals("Sofia")){
                    totalPrice = quantity * 1.45;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = quantity * 1.30;
                } else if (town.equals("Varna")) {
                    totalPrice = quantity * 1.35;
                }
                break;

            case "peanuts":
                if (town.equals("Sofia")){
                    totalPrice = quantity * 1.60;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = quantity * 1.50;
                } else if (town.equals("Varna")) {
                    totalPrice = quantity * 1.55;
                }
                break;
        }


        System.out.println(totalPrice);



    }
}

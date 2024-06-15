package WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minNumber = Integer.MAX_VALUE;

        /*while (true){
            String input = scanner.nextLine(); // Получаваме или цели числа или команда "Stop"
            if (input.equals("Stop")){
                break;
            }

            int currentNum = Integer.parseInt(input);
            if(currentNum < minNumber){
                minNumber = currentNum;
            }
        }*/

        String input = scanner.nextLine(); // Получаваме или цели числа или команда "Stop"

        boolean isTrue = true;

        while (isTrue){

            if(input.equals("Stop")){
                isTrue = false;
            }else {

                int currentNum = Integer.parseInt(input);
                if (currentNum < minNumber) {
                    minNumber = currentNum;

                }
                input = scanner.nextLine();
            }

        }



        System.out.println(minNumber);
    }
}

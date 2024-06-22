package NestedLoops;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        //обикаляме през всеки етаж -> започваме от последния и приключваме на 1-вия етаж
        for (int i = floors; i >= 1 ; i--) {

            //обикаляме през стаите -> започваме от нулевата стая и приключваме в последната - 1
            for (int j = 0; j < rooms; j++) {
                //ако се намираме на последния етаж -> L + floor + room ->
                if (i == floors){
                    System.out.printf("L%d%d ", i, j);
                } else if ( i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                }else {
                    System.out.printf("A%d%d ", i, j);
                }

            }

            System.out.println();

            
        }



    }
}

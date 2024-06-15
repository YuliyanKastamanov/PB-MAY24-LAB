package WhileLoop;

import java.util.Scanner;

public class Graduation_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int countGrades = 1; // ученикът започва обучението си от 1-ви клас
        int countExcluded = 0; // първоначално ученикът не е бил изключван
        double sumGrades = 0;

        while (countGrades <= 12){
            double currentGrade = Double.parseDouble(scanner.nextLine());

            //Имаме 2 варианта ->
            // 1. currentGrade < 4 - ученикът повтаря класа
            // 2. currentGrade >= 4 - ученикът преминава в следващ клас

            if(currentGrade < 4){
                countExcluded++;
            }else {
                //countExcluded = 0; -> ако имаме условие двете години слаби оценки да са последователни
                sumGrades += currentGrade;
                countGrades++;
            }

            if(countExcluded == 2){
                break;
            }
        }

        if(countExcluded == 2){
            System.out.printf("%s has been excluded at %d grade", name, countGrades);
        }else {
            double averageGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);

        }


    }
}

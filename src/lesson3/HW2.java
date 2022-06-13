package lesson3;

import java.util.Arrays;

public class HW2 {

    //Task1
    public static void showNumbers () {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+"a" + " ");
        }
    }

    //Task2
    public static void sentTo(int age) {
        System.out.println();
        if (age > 0 && age <= 6) {
            System.out.println("Идите в садик");
        } else if (age > 6 && age <= 11) {
            System.out.println("Пора в младшую школу");
        } else if (age > 11 && age <= 17) {
            System.out.println("Идите в среднюю школу");
        } else if (age > 17 && age < 65) {
            System.out.println("Идите в университет");
        }
    }
    //Task3
    public static void makeSalad(boolean chicken, boolean vegetables, boolean sour, boolean toast, boolean sausage, boolean eggs) {
        if (chicken && vegetables && sour && toast){
            System.out.println("Делаем салат - Цезарь");
        } else if (vegetables && sausage && chicken && eggs) {
            System.out.println("Делаем салат - Оливье");
        } else if (vegetables) {
            System.out.println("Делаем салат - Овощной");
        } else {
            System.out.println("У меня ничего нет");
        }
    }
    public static void sumNumbers (double num1, double num2) {
        if (num1 > 0) {
            double result = 0;
            int cicle = 0;
            while (result < 1_000_000) {
                result += (num1 + num2);
                cicle++;
            }
            System.out.println(cicle);
        }
    }

    public static void changeElement (int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void makeServiceBill (boolean hasFuel, boolean hasElectricsProblem, boolean hasMotorProblem,
                                        boolean hasTransmissionProblem, boolean hasWheelsProblem ) {
        int serviceBill = 0;
        if (!hasFuel) {
            serviceBill += 1000;
        }
        if (hasElectricsProblem) {
            serviceBill += 10_000;
        }
        if (hasMotorProblem) {
            serviceBill += 5000;
        }
        if (hasTransmissionProblem) {
            serviceBill += 4000;
        }
        if (hasWheelsProblem) {
            serviceBill += 4000;
        }
        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            serviceBill -= serviceBill*0.2;
        }
        System.out.println(serviceBill);

    }



}

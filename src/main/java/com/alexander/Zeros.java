package com.alexander;

import java.util.Scanner;

public class Zeros {
    public int calculating(char varArray[]) {
        int result = 0;
        int maxZeros = 0;

//        System.out.println("Оно состоит из: " + varArray.length + " цифр.");
        for (Character ch : varArray) {
//            System.out.print("Цифра ---> " + ch);
            if (ch == '0') {
//                System.out.println(" <--- Это ноль!");
                maxZeros += 1;
            } else {
//                System.out.println(" <--- Попался НЕ ноль :(");
                if (result < maxZeros) {
                    result = maxZeros;
                }
                maxZeros = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String result;
        int nZero;

        System.out.print("Введите тестовое число: ");

        Scanner in = new Scanner(System.in);
        String varString = in.next();

        System.out.println("Вы выбрали число: " + varString);
        char vArr[] = varString.toCharArray();

        Zeros obj = new Zeros();
        // Вызываем метод для вычисления нулей
        nZero = obj.calculating(vArr);
        result = ("Максимальное кол-во нулей между цифрами = " + nZero);

        System.out.println(result);

    }
}
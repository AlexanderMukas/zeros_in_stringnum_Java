package com.alexander;

import java.util.Scanner;

public class Zeros {
    public int calculating(char varArray[]){
        int temp = 0;
        int max_zero = 0;
        System.out.println("Оно состоит из: " + varArray.length + " цифр.");
        // Основной цикл - перебор по всем цифрам
        for (Character ch : varArray) {
            System.out.print("Цифра ---> " + ch);
            if (ch == '0'){
                System.out.println(" <--- Это ноль!");
                max_zero += 1;
                if (temp < max_zero){
                    temp = max_zero;
                }

            }else {
                System.out.println(" <--- Попался НЕ ноль :(");
                max_zero = 0;
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        String result;
        int nZero;

        System.out.print("Введите тестовое число: ");

        Scanner in = new Scanner(System.in);
        String varString = in.next();

        System.out.println("Вы выбрали число: " + varString );
        char vArr[] = varString.toCharArray();

        Zeros obj = new Zeros();
        // Вызываем метод для вычисления нулей
        nZero = obj.calculating(vArr);
        result = ("Максимальное кол-во нулей между цифрами = " + nZero );

        System.out.println(result);

    }
}

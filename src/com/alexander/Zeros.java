package com.alexander;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        int temp = 0;
        int number = 0;
        int max_zero = 0;
        System.out.print("Введите тестовое число: ");

        Scanner in = new Scanner(System.in);
        String varString = in.next();

        System.out.println("Вы выбрали число: " + varString );
        char arr[] = varString.toCharArray();
        System.out.println("Оно состоит из: " + arr.length + " цифр.");

        for (Character ch : arr) {
            System.out.print("Цифра ---> " + ch);
            if (ch == '0'){
                System.out.println(" <--- Попался ноль!");
            }else {
                System.out.println(" <--- Попался НЕ ноль :(");
            }

        }
        System.out.println("Конец расчета!");

    }
}

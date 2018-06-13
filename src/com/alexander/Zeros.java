package com.alexander;

import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        System.out.println("Привет. Вот программа на Java");
        System.out.print("Введите тестовое число: ");
        Scanner in = new Scanner(System.in);
        String num = in.next();
        for (Character temp: num.toCharArray()
             ) {
            System.out.println("Цифра ---> " + temp);

        }
        System.out.println("Вы ввели цифру - " + num);
    }
}

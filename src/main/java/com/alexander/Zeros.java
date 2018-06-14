package com.alexander;

import java.util.Scanner;

public class Zeros {
    public int calculating(char varArray[]){
        int temp = 0;
        int max_zero = 0;
//        System.out.println("Оно состоит из: " + varArray.length + " цифр.");
        // Основной цикл - перебор по всем цифрам
        for (Character ch : varArray) {
//            System.out.print("Цифра ---> " + ch);
            if (ch == '0'){
//                System.out.println(" <--- Это ноль!");
                max_zero += 1;
                if (temp < max_zero){
                    temp = max_zero;
                }

            }else {
//                System.out.println(" <--- Попался НЕ ноль :(");
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

/*

# JMH version: 1.21
# VM version: JDK 1.8.0_172-ea, Java HotSpot(TM) 64-Bit Server VM, 25.172-b03
# VM invoker: D:\dev\jdk\jdk-8u172\jre\bin\java.exe
# VM options: -javaagent:D:\dev\apps\idea-18.2\lib\idea_rt.jar=59653:D:\dev\apps\idea-18.2\bin -Dfile.encoding=UTF-8
# Warmup: 3 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: perf.ZeroCalcPerf.calculating

Benchmark                                     Mode  Cnt   Score    Error   Units
ZeroCalcPerf.calculating                      avgt    5  20.325 ±  0.104   ns/op
ZeroCalcPerf.calculating:·gc.alloc.rate       avgt    5  ≈ 10⁻⁴           MB/sec
ZeroCalcPerf.calculating:·gc.alloc.rate.norm  avgt    5  ≈ 10⁻⁵             B/op
ZeroCalcPerf.calculating:·gc.count            avgt    5     ≈ 0           counts

 */

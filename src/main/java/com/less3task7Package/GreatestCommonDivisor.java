//Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
//        The method should return the greatest common divisor of two numbers.

package com.less3task7Package;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int nod = 1;

        if (first < 10 || second < 10) {
            return -1;
        } else {
            int min = first < second ? first : second;
            for (int i = 1; i <= min; i++) {
                if (first % i == 0 && second % i == 0) {
                    nod = i;
                }
            }
            return nod;
        }
    }

    public static void main(String[] args) {
        int biggest, first, second;

        Scanner in = new Scanner(System.in);

        // вводим строку
        System.out.print("Input the first digit: ");
        String str1 = in.nextLine();
        System.out.print("Input the second digit: ");
        String str2 = in.nextLine();

        // проверяем введены ли цифры, если нет - программа прекращает работу
        try {
            Integer.parseInt(str1);
            Integer.parseInt(str2);

        } catch (Exception e) {
            System.out.println("One or both of entered values are not number or numbers are too big");
            System.exit(0);
        }

        // определяем значения переменных
        first = Integer.parseInt(str1);
        second = Integer.parseInt(str2);

        // находим наибольший общий делитель
        biggest = getGreatestCommonDivisor(first, second);

        // выводим результат
        if (biggest == -1) {
            System.out.println("One of the parameters is less then 0. Result: " + biggest);
        } else {
            System.out.println("The Greatest Common Divisor of " + first + " and " + second + " is: " + biggest);
        }

    }
}

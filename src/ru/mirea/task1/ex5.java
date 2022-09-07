package ru.mirea.task1;

import java.util.Scanner;

public class ex5 {
    public static int factorial(int x){
        int res = 1, i = 1;
        while (i <= x){
            res *= i;
            i++;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.print("Факториал введённого числа: "+factorial(input.nextInt()));
        input.close();
    }
}

package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args){
        Random rand = new Random();
        int a1[] = new int[10];

        for(int i=0;i<10;i++) {
            a1[i] = (int) Math.ceil(2000 * Math.random()) - 1000;
        }
        int a2[] = rand.ints(10).toArray();
        System.out.println("Массив 1: "+ Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("Отсортированный массив 1: " + Arrays.toString(a1));
        System.out.println("Массив 2: " + Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.print("Отсортированный массив 2: " + Arrays.toString(a2));
    }
}

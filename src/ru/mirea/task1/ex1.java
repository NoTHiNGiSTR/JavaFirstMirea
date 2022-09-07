package ru.mirea.task1;

public class ex1 {
    public static void main(String[] args) {
        int arr[] = {12, 16, 178, 1, 14, 2, 3};
        int sum1 = 0, sum2 = 0, sum3 = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        while (j < arr.length) {
            sum2 += arr[j];
            j++;
        }
        j = 0;
        do {
            sum3 += arr[j];
            j++;
        }while(j<arr.length);
        System.out.println(sum1 + " " + sum2 + " " + sum3);
    }
}
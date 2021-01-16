package by.company.task;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        int z=20;

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(100) - 50;
            System.out.print(a[i] + "  ");
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
            }
        }
        System.out.print("\nNew massive \n ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}

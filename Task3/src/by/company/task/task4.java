package by.company.task;

//4. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int n = 3;
        int K = 5;
        int count = 0;
        int[] A = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextInt(100) - 50;
            System.out.print(A[i] + "  ");
            if (A[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nЧетных чисел нет");
            return;
        }

        int[] Even = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Even[j] = A[i];
                j++;
            }
        }
        System.out.println("\nЧетные числа ");
        for (j = 0; j < count; j++) {
            System.out.print(Even[j] + "  ");
        }
    }
}

package by.company.task;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(100) - 50;
            System.out.print(a[i] + "  ");
            if (a[i]>0){
                positive++;
            }
            if (a[i]<0){
                negative++;
            }
            if (a[i]==0){
                zero++;
            }
        }

            System.out.println("\nположительных элементов - "+positive+"\nотрицательных элементов - "+negative+"\nнулей - "+zero);

    }

}

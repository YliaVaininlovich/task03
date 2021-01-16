package by.company.task;

//Даны действительные числа  Найти
//max(a1 + a2n,a2 + a2n−1,,an + an+1)

import java.util.Random;

public class task10 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        int[] b = new int[n/2];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(100) - 50;
            System.out.print(a[i] + "  ");
        }
        for (int i = 0; i < n/2; i++) {
            b[i] = a[i]+a[n-1-i];
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "  ");
        }

    }
}

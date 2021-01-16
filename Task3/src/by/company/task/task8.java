package by.company.task;

import java.util.Random;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
public class task8 {
    public static void main(String[] args) {

        int[] a = new int[]{5, 6, 8, 3, 7, 5, 3, 7, 9, 9};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i <  a.length; i++) {
            if (a[i]==i) {
                System.out.print(a[i] + "  ");
            }
        }
    }

}

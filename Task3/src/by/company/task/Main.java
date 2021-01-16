package by.company.task;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n=10;
        int K=5;
        int summ=0;
        int[] A = new int[n];

        Random rnd = new Random();

        for (int i=0; i<n; i++){
           A[i]=rnd.nextInt(100);
            System.out.print(A[i]+"  ");
           if (A[i]%K==0){
               summ+=A[i];
           }
        }
        System.out.println("\nСумма кратных "+K+" равна "+summ);


    }
}

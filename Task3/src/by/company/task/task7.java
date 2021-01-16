package by.company.task;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.Random;

public class task7 {

    public static void main(String[] args){
        int n=10;
        int[] a = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(100) - 50;
            System.out.print(a[i] + "  ");
        }

        int max = a[0];
        int min =a[0];
        int imax=0;
        int imin=0;
        for (int i = 0; i < n; i++){
            if (a[i]<min){
                min=a[i];
                imin=i;
            }
            if (a[i]>max){
                max=a[i];
                imax=i;
            }
        }

      int tmp = a[imin];
       a[imin]=a[imax];
        a[imax]=tmp;
        System.out.println("\nnew massive");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }

}

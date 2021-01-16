package by.company.task;

import java.util.Random;

//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа
public class task5 {

    public static void main(String[] args){
        int n=10;
        int[] a = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(10) - 5;
            System.out.print(a[i] + "  ");
        }

        int max = a[0];
        int min =a[0];
        for (int i = 0; i < n; i++){
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
        }

        int minLenght=Math.abs(max-min);
        System.out.println("наименьшая длина числовой оси ="+minLenght);

    }
}

package by.company.task;

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class task2 {

    public static void main(String[] args) {
        int K = 5;
        int count = 0;
        int[] A = new int[]{6, 7, 0, -3, -1, 0, 0, 9, 3, 0};


        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
            if (A[i] == 0) {
                count++;
            }
        }
        int[] Zero = new int[count];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                Zero[j] = i;
                j++;
            }
        }
        System.out.println("\n\n Позиции нулей:");
        for (int i = 0; i < count; i++) {
            System.out.print(Zero[i] + 1 + "  ");
        }

    }
}

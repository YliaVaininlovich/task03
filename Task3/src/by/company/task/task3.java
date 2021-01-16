package by.company.task;

//3. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class task3 {

    public static void main(String[] args) {

        int[] A = new int[]{4, 8, 10, 12, 15,17, 20};

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
            }

         int flag=0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i+1]) {
                flag=1;
                break;
            }
        }
if (flag==0){
    System.out.println("\nПоследовательность возрастающая");
}
else {
    System.out.println("\nПоследовательность не возрастающая");
}
    }
}

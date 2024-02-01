package exercises;

import java.util.Scanner;

public class SumVectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values do you will enter? ");
        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Enter the values of vector A: ");
        for (int i=0; i<n; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B: ");
        for (int i=0; i<n; i++){
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Result Vector: ");
        for (int i=0; i<n; i++){
            int sum = vetorA[i] + vetorB[i];
            System.out.println(sum);
        }



        sc.close();
    }
}

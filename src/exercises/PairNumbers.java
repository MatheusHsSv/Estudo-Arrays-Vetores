package exercises;

import entities.PairCalculator;

import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you will enter? ");
        int n = sc.nextInt();
        PairCalculator[] vector = new PairCalculator[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            vector[i] = new PairCalculator(number);

        }

        System.out.println("Pair numbers: ");
        int parNumbers = 0;
        for (int i=0; i<n; i++){
            System.out.print(vector[i].getNumber() + " ");

            if (vector[i].getNumber() % 2 == 0){
                parNumbers++;
            }
        }
        System.out.println();
        System.out.println("amount of even numbers: " + parNumbers);



        sc.close();
    }
}

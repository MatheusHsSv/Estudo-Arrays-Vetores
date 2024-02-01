package exercises;

import entities.NumbersCalculator;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();
        NumbersCalculator[] vect = new NumbersCalculator[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            double numbers = sc.nextInt();
            vect[i] = new NumbersCalculator(numbers);
        }
        System.out.print("Values: ");
        double sum = 0;
        for (int i=0; i<n; i++){
            System.out.print(vect[i].getNumbers() + " ");
            sum += vect[i].getNumbers();
        }
        System.out.println();
        System.out.println("Sum: " + sum);

        double avg = sum / n;

        System.out.println("Average: " + avg);

        sc.close();
    }
}

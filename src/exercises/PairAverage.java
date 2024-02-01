package exercises;

import entities.PairAverageCalc;

import java.util.Scanner;

public class PairAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements will have the vector? ");
        int n = sc.nextInt();
        PairAverageCalc[] vector = new PairAverageCalc[n];

        int pairs = 0;
        int npairs = 0;
        for (int i=0; i<n; i++){
            System.out.println("Enter a number:");
            int numbers = sc.nextInt();
            vector[i] = new PairAverageCalc(numbers);
            if (vector[i].getNumbers() % 2 == 0){
                 pairs = pairs + vector[i].getNumbers();
                 npairs++;
            }

        }

        if (pairs == 0){
            System.out.println("No even number!");
        }else{
            double pairAvg = (double)pairs / npairs;

            System.out.println("Pair numbers Average: " + pairAvg);
        }


        sc.close();
    }
}

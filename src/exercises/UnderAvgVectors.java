package exercises;

import java.util.Scanner;
import entities.UnderAvgCalc;

public class UnderAvgVectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element will have the vector? ");
        int n = sc.nextInt();
        UnderAvgCalc[] vector = new UnderAvgCalc[n];

        double sum = 0;
        for (int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            double numbers = sc.nextDouble();
            vector[i] = new UnderAvgCalc(numbers);
            sum += vector[i].getNumbers();
        }

        double vectorAvg = sum / n;
        System.out.println("Vector average: " + vectorAvg);

        System.out.println("Under average elements: ");
        for (int i=0; i<n; i++){
            if (vector[i].getNumbers() < vectorAvg){
                System.out.println(vector[i].getNumbers());
            }
        }



        sc.close();
    }
}

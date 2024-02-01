package exercises;

import entities.HighestNumberCalculator;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you will enter?: ");
        int n = sc.nextInt();

        HighestNumberCalculator[] vector = new HighestNumberCalculator[n];

        double highestNumber = 0;
        int highestNumberPosition = 0;
        for(int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            double numbers = sc.nextDouble();
            vector[i] = new HighestNumberCalculator(numbers);
            if (vector[i].getNumbers() > highestNumber){
                highestNumber = vector[i].getNumbers();
                highestNumberPosition = i + 1;
            }
        }

        System.out.println("Highest value: " + highestNumber);
        System.out.println("Highest value position: " + highestNumberPosition);




        sc.close();
    }
}

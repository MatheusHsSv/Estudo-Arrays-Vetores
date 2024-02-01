package exercises;

import entities.Numbers;

import java.util.Scanner;

public class NegativeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números deseja analisar?");
        int n = sc.nextInt();
        Numbers[] vect = new Numbers[n];

        System.out.println("digite os numeros: ");
        for (int i=0; i<n; i++) {
            int numbers = sc.nextInt();
            vect[i] = new Numbers(numbers);
         }
       for (int i=0; i<n; i++){
           if (vect[i].getNumbers() < 0){
              int negativos = vect[i].getNumbers();
               System.out.println(negativos);
           }
       }
        sc.close();
    }
}

package study;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
            System.out.println(vect[i].getName());
        }

        double avg = sum / n;

        System.out.println(avg);

        sc.close();
    }
}

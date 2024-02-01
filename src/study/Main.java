package study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] va = new double[n];

        for( int i=0; i<n; i++){
            va[i] = sc.nextDouble();
    }

        double sum = 0;

        for(int i=0; i<n; i++){
            sum += va[i];
        }
        double avg = sum / n;

        System.out.println(avg);

        sc.close();
}}
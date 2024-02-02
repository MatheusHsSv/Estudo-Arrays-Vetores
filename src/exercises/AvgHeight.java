package exercises;

import entities.HeightProgram;

import java.util.Scanner;

public class AvgHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        HeightProgram[] vect = new HeightProgram[n];
        int pessoa = 1;
        for (int i=0; i<n; i++){
            System.out.println("Dados da "+ pessoa +"a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new HeightProgram(name, age, height);
            pessoa += 1;
        }

        double sum = 0;
        for (int i=0 ; i<n; i++){
            sum += vect[i].getHeight();
        }
        double heightavg = sum / n;

        int underAge = 0;
        for (int i=0; i<n; i++){
            if (vect[i].getAge() < 16){
                underAge++;
            }
        }


        double percentualMenores = ((double) underAge / n) * 100;
        System.out.printf("Altura média: %.2f%n ", heightavg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
        sc.nextLine();
        String guysUnderAge;
        for (int i=0; i<n; i++){
            if (vect[i].getAge() < 16){
                guysUnderAge = vect[i].getName();
                System.out.println(guysUnderAge);
            }
        }





        sc.close();

    }
}

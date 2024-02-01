package exercises;

import entities.MoreOlderCalc;

import java.util.Scanner;

public class MoreOlder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many peoples do you will enter? ");
        int n = sc.nextInt();
        MoreOlderCalc[] vector = new MoreOlderCalc[n];

        int moreOlderGuy = 0;
        String moreOlderGuyName = null;
        for (int i=0; i<n; i++){
            System.out.println(i + 1 +"- person data: ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            vector[i] = new MoreOlderCalc(name, age);
            if (vector[i].getAge() > moreOlderGuy){
                moreOlderGuy = vector[i].getAge();
                moreOlderGuyName = vector[i].getName();
            }
        }

        System.out.println("More older guy: " + moreOlderGuyName);

        sc.close();
    }
}

package exercises;

import entities.ApprovedStudentsCalc;

import java.util.Scanner;

public class ApprovedStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many students will be entered? ");
        int n = sc.nextInt();
        ApprovedStudentsCalc[] vector = new ApprovedStudentsCalc[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter the name, and first and second grade of the "+ (i + 1) +"s student: ");
            sc.nextLine();
            String name = sc.nextLine();
            double grade = sc.nextInt();
            double grade2 = sc.nextInt();

            vector[i] = new ApprovedStudentsCalc(name, grade, grade2);
        }

        double sum = 0;
        System.out.println("Students approved: ");
        for (int i=0; i<n; i++){
            sum += vector[i].getGrade();
            sum += vector[i].getGrade2();
            double avg = sum / 2;
            if (avg >= 6.0){
                System.out.println(vector[i].getName());
            }
        }




        sc.close();



    }
}

package exercises;

import java.util.Objects;
import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many peoples will be enter? ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] gender = new char[n];

        double highestHeight = 0;
        double lowerHeight = 100;
        for (int i=0; i<n; i++){
            System.out.println(i + 1 +" person data");
            System.out.print("height: ");
            altura[i] = sc.nextDouble();
            System.out.print("Gender: ");
            sc.nextLine();
            gender[i] = sc.next().charAt(0);
            if (altura[i] < lowerHeight){
                lowerHeight = altura[i];
            }else if (altura[i] > highestHeight){
                    highestHeight = altura[i];
            }}
            System.out.println("Lower Height: " + lowerHeight);
            System.out.println("Highest height: " + highestHeight);

            int numberOfmen = 0;
            int numberOfwomen = 0;
            double womenHeights = 0;
            for (int i=0; i<n; i++){
                if (gender[i]=='f' || gender[i]== 'F') {
                    womenHeights += altura[i];
                    numberOfwomen = numberOfmen + 1;
                }else if (gender[i]=='m' || gender[i]=='M'){
                    numberOfmen = numberOfmen + 1;
                }
        }
            double womenAvgHeight = womenHeights / numberOfwomen;

            System.out.println("average of the Heights of the women: " + womenAvgHeight)  ;

            System.out.println("Number of mens: " + numberOfmen);

        sc.close();
    }
}

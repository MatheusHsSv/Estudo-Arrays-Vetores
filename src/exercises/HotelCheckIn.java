package exercises;

import entities.HotelCheckInSystem;

import java.util.Scanner;

public class HotelCheckIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        HotelCheckInSystem[] vector = new HotelCheckInSystem[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vector[room] = new HotelCheckInSystem(name,email,room);
        }
        System.out.println("Busy rooms:");
        for (int i=0; i< vector.length; i++){
            if (vector[i] != null){
                System.out.println(vector[i].getRoom()+": "+ vector[i].getName()+", "+ vector[i].getEmail());
            }
        }



        sc.close();
    }
}

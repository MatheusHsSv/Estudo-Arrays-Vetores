package ListExercises;


import ListEntities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreaseSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (position(list, id)){
                System.out.println("ja existe");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employees(name,id,salary));
        }


        int idpos = sc.nextInt();

        Employees emp = list.stream().filter(x -> x.getId() == idpos).findFirst().orElse(null);
        if (emp == null){
            System.out.println("this id does not exist!");
        }
        else{
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        for (Employees obj : list){
            System.out.println(obj);
        }



        sc.close();
    }

    public static boolean position(List<Employees> list, int id){
        for (int i=0; i<list.size(); i++){
                    if (list.get(i).getId() == id){
                        return true;
                    }

                }
        return false;
    }
}

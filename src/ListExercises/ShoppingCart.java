package ListExercises;

import ListEntities.ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ShoppingCartSystem> list = new ArrayList<>();


        System.out.print("Choose an option: ");
        int opc;
        do {
            opc = scanner.nextInt();

            if (opc == 1){
                IncreaseItem(list);
            } else if (opc == 2) {
                RemoveItem(list);
            }else if (opc == 3){
                ShowSoppingCart(list);
            }



        }while (opc != 0);









        scanner.close();
    }
    public static void IncreaseItem(List<ShoppingCartSystem> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the item: ");
        String name = sc.nextLine();
        System.out.print("Enter the price of the item: ");
        double price = sc.nextDouble();
        list.add(new ShoppingCartSystem(name, price));
        System.out.println("item increase on your shopping cart!");
        sc.nextLine();

    }
public static void RemoveItem(List<ShoppingCartSystem> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the item who you will remove: ");
        String nameItemRemove = sc.nextLine();

        ShoppingCartSystem itemRemove = null;
        for (ShoppingCartSystem item : list){
            if (item.getName().equalsIgnoreCase(nameItemRemove)){
                itemRemove = item;
                break;
            }
        }
        if (itemRemove != null){
            list.remove(itemRemove);
            System.out.println("item removed of your cart!");
        }else {
            System.out.println("item not found");
        }

}

public static void ShowSoppingCart(List<ShoppingCartSystem> list){
    System.out.println("Your Shopping cart has: ");
    for (ShoppingCartSystem obj : list){
        System.out.println("Name: " + obj.getName() + ", Price: " + obj.getPrice());
    }
}

}



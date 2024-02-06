package study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();




        list.add("Matheus");
        list.add("Mtheus");
        list.add("Mathe");
        list.add("Matus");
        list.add(3, "GOlf");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);

        }

        System.out.println("----------------------------------");

         list.removeIf(x -> x.charAt(0) == 'G');

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        System.out.println("index of golf:" + list.indexOf("Matheus"));
        System.out.println("-------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);


    }
}

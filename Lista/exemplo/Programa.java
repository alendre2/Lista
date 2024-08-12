package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Alendre");
        list.add("Bell");
        list.add("Ana");
        list.add("Aline");
        list.add("Marcos");
        list.add(2,"Marco");

        System.out.println(list.size());


        for (String x: list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'A');

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index of Bell: " + list.indexOf("Bell"));
        System.out.println("Index of Julia: " + list.indexOf("Julia"));

        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    
    }
    



}
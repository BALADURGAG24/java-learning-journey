package HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana", 0.25);
        map.put("cherry", 0.75);
        map.put("dates", 1.00);

        map.remove("apple");
        System.out.println(map);
        System.out.println();

        System.out.println(map.get("dates"));
        System.out.println(map.get("coconut"));
        System.out.println();

        System.out.println(map.containsKey("cherry"));
        System.out.println(map.containsKey("pineapple"));
        System.out.println();

        if(map.containsKey("banana")){
            System.out.println(map.get("banana"));
        }else{
            System.out.println("Key not found!");
        }

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }else{
            System.out.println("Key not found!");
        }
        System.out.println();

        System.out.println(map.containsValue(1.00));
        System.out.println(map.containsValue(1));
        System.out.println();

        System.out.println(map.size());
        System.out.println();

        System.out.println(map);
        System.out.println();

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}

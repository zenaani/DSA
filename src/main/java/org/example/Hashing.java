package org.example;

import java.util.HashMap;
import java.util.List;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Zen", 1);
        map.put("Zaam", 2);
        map.put("Athul", 3);
        map.put("Anand", 4);

        System.out.println("Size of map is " + map.size());

        System.out.println(map);
        var x = map.get(1);
        System.out.println(x);

        map.remove("Anand");
        System.out.println(map.keySet());

        for(String name: map.keySet()) {
            System.out.println(name);
        }

        for(Integer rank: map.values()) {
            System.out.println(rank);
        }

        for(String name: map.keySet()) {
            System.out.println("Key:" + name + "    Value:" + map.get(name));
        }

    }
}

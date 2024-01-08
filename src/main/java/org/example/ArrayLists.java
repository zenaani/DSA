package org.example;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        List notColors = new ArrayList<>();
        notColors.add("hahha");
        notColors.add(1);

        System.out.println(notColors);


        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));

        for(int i=0; i<colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for(String color: colors) {
            System.out.println(color);
        }

        List<String> colorsUnmodifiable = List.of("Red", "blue", "green");
    }
}

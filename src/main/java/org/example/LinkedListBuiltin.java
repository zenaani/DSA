package org.example;

import java.util.LinkedList;

public class LinkedListBuiltin {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Zen");
        list.addLast("Zenaani");
        list.addFirst("Z");


        for(String x: list) {
            System.out.println(x);
        }

    }


}

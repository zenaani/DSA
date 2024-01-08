package org.example;

import java.util.HashMap;

public class LeetValidAnagrams {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagram";

        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();

        for(char c: s.toCharArray()) {
            if(!hashS.containsKey(c)) {
                hashS.put(c, 1);
            } else {
                hashS.put(c, hashS.get(c) + 1);
            }
        }

        for(char c: t.toCharArray()) {
            if(!hashT.containsKey(c)) {
                hashT.put(c, 1);
            } else {
                hashT.put(c, hashT.get(c) + 1);
            }
        }

        System.out.println(hashS);
        System.out.println(hashT);

        if(hashS.equals(hashT)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

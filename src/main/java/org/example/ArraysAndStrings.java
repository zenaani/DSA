package org.example;

import java.util.Arrays;

public class ArraysAndStrings {
    public static boolean isAnagram(String str1, String str2) {

        char[] str1A = str1.toCharArray();
        char[] str2A = str2.toCharArray();

        Arrays.sort(str1A);
        Arrays.sort(str2A);

        return Arrays.equals(str1A, str2A);
    }

    public static void main(String[] args) {
        char[] something = new char[5];
        something[0] = 65;
        something[2] = 66;
        something[3] = 67;
        something[4] = 68;

        System.out.println(something);

        char[] haha = {65,66};
        System.out.println(haha);

        String s = "Zenaani Suresh";

        char[] charArray = s.toCharArray();

        for(char i: charArray) {
            System.out.println(i);


        }

        System.out.println(s.replace('Z','z'));
        System.out.println(s.length());
        System.out.println(s.equals("Zenaani"));
        System.out.println(s.substring(0,3));
        System.out.println(s.indexOf('Z'));
        System.out.println(s.contains("Zen"));

        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.replace(' ','5'));

        String[] words = s.split("e");

        for(String word: words) {
            System.out.println(word);
        }

        boolean x = isAnagram("eat", "ate");
        System.out.println(x);




    }
}

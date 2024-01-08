package org.example;

import java.util.*;

public class Playground {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Stack<Integer> stack1 = new Stack<>();
        stack1.add(5);
        stack1.add(10);

        Stack<Float> stack2 = new Stack<>();
        stack2.add(2f);
        stack2.add(5f);

        List<Stack> nums = new ArrayList<>(); //A List of Stacksssss

        nums.add(stack1);
        nums.add(stack2);

        System.out.println(nums);

        //Now lets try creating a stack of lists

        Stack<List> whatever = new Stack<>();
        var x = List.of(1,2,3,4,"a");
        var y = List.of("a", "b", "ahdashvdas");

        whatever.add(x);
        whatever.add(y);
        whatever.push(List.of("hahah", "hohoh"));

        var z = whatever.peek();
        var a = whatever.search(List.of("a", "b", "ahdashvdas"));

        var contains = whatever.containsAll(List.of(List.of("a", "b", "ahdashvdas"),List.of("hahah", "hohoh")));

        System.out.println("Does it contain : ?");
        System.out.println(contains);
        System.out.println(z);
        System.out.println(a);

        System.out.println(whatever);








        for(Integer i: numbers) {
            if(i % 2 == 0) {
                System.out.println(i + " Its even");
            }
        }


    }
}

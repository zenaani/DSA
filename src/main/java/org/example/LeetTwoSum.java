package org.example;

import java.util.HashMap;

public class LeetTwoSum {
    public static void main(String[] args) {
        int[] nums = { 3,2,4 };
        int diff=0;
        int target = 9;

        HashMap<Integer, Integer> hashNums = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            hashNums.put(nums[i], i);
        }

        System.out.println(hashNums);

        for(int i=0; i<nums.length; i++) {
            diff = target - nums[i];

            if(hashNums.containsKey(diff)) {
                System.out.println("got");
                System.out.println(nums[i]);
                System.out.println(diff);
                break;
            }
        }






    }
}

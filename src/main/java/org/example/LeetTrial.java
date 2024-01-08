package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetTrial {
    public static void main(String[] args) {
        int[] realnums = {4,1,1,5,2,3,2,2,};
        int[] nums = {4,1,1,5,2,3,2,2,};
        int[] counts = {0,0,0,0,0,0,0,0};

        for(int i=0; i<8; i++) {
            int count = 1;
            for(int j=i+1; j<8; j++) {
                if(nums[i] == nums[j]) {
                    count = count + 1;
                    counts[j]=-1;

                }
                counts[i] = count;

            }
        }



        for(int i: nums) {
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i: counts) {
            System.out.print(i + " ");
        }

        //bubble sort
    }
}

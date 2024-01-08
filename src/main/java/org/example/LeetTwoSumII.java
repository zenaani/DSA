package org.example;

public class LeetTwoSumII {
    public static void main(String[] args) {
        int[] arr = { 2,7,11,15 };
        int target = 9;
        int sum = 0;

        int first = 0;
        int last = arr.length - 1;

        while(true) {
            sum = arr[first] + arr[last];

            if(sum == target) {
                System.out.println("got it");
                System.out.println(first+1);
                System.out.println(last+1);
                break;
            } else if (sum < target) {
                first++;
            } else if (sum > target) {
                last--;
            }


        }







    }
}

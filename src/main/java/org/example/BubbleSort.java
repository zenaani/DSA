package org.example;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static int[] mirrorSort(int[] countArr, int[] arr) {

        int temp;

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    temp = countArr[j];
                    countArr[j] = countArr[j+1];
                    countArr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void removeDuplicates(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i]==arr[j] && i!=j) {
                    arr[j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {5,5,5,6,6,7};
        int count;
        int[] countArr = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            count=0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + "   count = " + count);
            countArr[i] = count;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countArr));

        mirrorSort(countArr,arr);
        System.out.println();

        System.out.println(Arrays.toString(countArr));
        System.out.println(Arrays.toString(arr));

        removeDuplicates(arr);
        removeDuplicates(countArr);

        mirrorSort(countArr,arr);


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countArr));

        int k=2;
        int[] result = new int[2];

        for(int i=0; i<k; i++) {
            result[i] = countArr[i];
        }

        System.out.println();
        System.out.println(Arrays.toString(result));

    }


}

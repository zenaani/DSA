package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("c");
        list.addFirst("x");
        list.removeFirst();

        Node currNode = list.head;
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }

        System.out.println("null");


        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.rInsert(27);

        System.out.println(bst.root.left.right.value);

        System.out.println(bst.rContains(23));




        /**
        String[] colors = new String[5];

        colors[0] = "red";
        colors[2] = "violet";

        System.out.println(Arrays.toString(colors));

        for(int i=0; i<colors.length; i++) {
            System.out.println(colors[i]);
        }

        int[] numbers = {100,200,300,400};

        for(int i=numbers.length-1; i>=0; i--) {
            System.out.println(colors[i]);
        }

        for(String color: colors) {
            System.out.println(color);
        }

        //Arrays.binarySearch()

         **/
    }


}
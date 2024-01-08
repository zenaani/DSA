package org.example;

public class BinarySearchTree {
    bNode root;

    public BinarySearchTree() {
        root = null;
    }


    public void insert(Integer value) {
        bNode newNode = new bNode(value);

        bNode temp = root;

        if(root == null) {
            root = newNode;
            return;
        }

        while (true) {

            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                temp = temp.left;
            } else if(newNode.value > temp.value) {
                if(temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                temp = temp.right;
            }

        }

    }

    /**
     * Let's try using Recursive function
     */

    private bNode rInsert(bNode currNode, Integer value) {

        if(currNode == null) return new bNode(value);

        if(value < currNode.value ) {
            currNode.left = rInsert(currNode.left, value);
        } else if (value > currNode.value) {
            currNode.right = rInsert(currNode.right, value);
        }

        return currNode;

    }

    public void rInsert(Integer value) {
        if(root == null) root = new bNode(value);
        rInsert(root, value);
    }


    private boolean rContains(bNode currNode, int value) {
        if(currNode == null) return false;
        if(currNode.value == value) return true;

        if(value < currNode.value) {
            return rContains(currNode.left, value);
        } else if(value > currNode.value) {
            return rContains(currNode.right, value);
        }

        return false;

    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }






}

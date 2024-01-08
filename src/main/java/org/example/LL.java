package org.example;

public class LL {
    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        Node temp = head;

        if(head == null) {              //if empty
            head = newNode;
            return;
        }

        while(temp.next != null) {          //Node Traversal
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void removeFirst() {

        if(head == null) {
            System.out.println("Empty LL");
            return;
        }

        head = head.next;
    }


    public void removeLast() {
        Node secondLast = head;
        Node last = head.next;

        while(last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

}

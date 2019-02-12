package com.algorithms.linkedlist;

public class LinkedList<T> {

    Node<T> head;

    public void append(T data) {

        Node<T> n = new Node<T>(data);
        if (head == null) {
            head = n;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = n;
    }

    public void prepend(T data) {
        if (head == null) {
            head = new Node<T>(data);
            return;
        }
        Node<T> oldHead = head;
        head = new Node<T>(data);
        head.next = oldHead;

    }

    public void delete(T data) {
        if (head.data == data) {
            head = head.next;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize(){
        int size = 0;

        Node<T> current = head;
        while(current != null){
            size ++;
            current = current.next;
        }

        return size;
    }

}

class Node<T> {
    Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}

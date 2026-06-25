package com.deckofcardsqueue;

public class Queue {

    Node front;
    Node rear;

    public void enqueue(Card card) {

        Node newNode = new Node(card);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public void display() {

        Node temp = front;

        while (temp != null) {

            System.out.println(temp.card);

            temp = temp.next;
        }
    }
}
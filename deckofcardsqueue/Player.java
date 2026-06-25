package com.deckofcardsqueue;

public class Player {

    String name;
    Queue cards;

    public Player(String name) {

        this.name = name;
        cards = new Queue();
    }

    public void addCard(Card card) {

        cards.enqueue(card);
    }

    public void showCards() {

        System.out.println("\n" + name + " Cards");

        cards.display();
    }
}
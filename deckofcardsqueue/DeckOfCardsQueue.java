package com.deckofcardsqueue;

import java.util.Random;

public class DeckOfCardsQueue {

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7","8",
                "9","10","Jack","Queen","King","Ace"
        };

        Card[] deck = new Card[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] = new Card(suit, rank);
            }
        }

        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomIndex = random.nextInt(52);

            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {

            players[i] = new Player("Player " + (i + 1));
        }

        index = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 9; j++) {

                players[i].addCard(deck[index++]);
            }
        }

        for (Player player : players) {

            player.showCards();
        }
    }
}


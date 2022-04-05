package com.company.etactics;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
//Populate List<Card> with all 52 cards
        List<Card> deckOfCards = deck.getDeck();

//Print out the size of the deck to the console
        System.out.println(deckOfCards.size() + " cards in the deck.");
        System.out.println();


//Shuffle the deck
        deck.shuffleDeck();

//Print the deck of cards to the console
        System.out.println("Shuffled Deck: ");
        for (Card card : deckOfCards) {
            System.out.println(card.getRankString() + " of " + card.getSuit());
        }

        System.out.println();

//Sort the deck of cards by rank(ignoring suit) and print to console
        deck.sortDeckByRank();

        System.out.println("Sorted by Rank: ");
        for (Card card : deckOfCards) {
            System.out.println(card.getRankString() + " of " + card.getSuit());
        }

//Sort the deck of cards by suit then rank


        System.out.println();
        deck.sortDeckBySuitThenRank();

        System.out.println("Sorted by SUIT and RANK: ");
        for (Card card : deckOfCards) {
            System.out.println(card.getRankString() + " of " + card.getSuit());
        }

    }
}

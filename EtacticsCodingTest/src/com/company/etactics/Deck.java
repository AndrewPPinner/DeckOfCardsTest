package com.company.etactics;

import java.util.*;

public class Deck {
    List<Card> deck = new ArrayList<>();
    private final List<List<String>> listOfRanks = Arrays.asList(Arrays.asList("TWO", "2"), Arrays.asList("THREE", "3"), Arrays.asList("FOUR", "4"), Arrays.asList("FIVE", "5"),
    Arrays.asList("SIX", "6"), Arrays.asList("SEVEN", "7"), Arrays.asList("EIGHT", "8"), Arrays.asList("NINE", "9"), Arrays.asList("TEN", "10"), Arrays.asList("JACK", "11"), Arrays.asList("QUEEN", "12"), Arrays.asList("KING", "13"), Arrays.asList("ACE", "14"));
    private final List<String> listOfSuits = new ArrayList<>(Arrays.asList("CLUBS", "DIAMONDS", "HEARTS", "SPADES"));

    public List<Card> getDeck() {
        for (List<String> rank : listOfRanks) {
            for (int i = 0; i < 4; i++) {
                deck.add(new Card(rank, listOfSuits.get(i)));
            }
        }
        return deck;
    }


    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void sortDeckByRank() {
        Collections.sort(deck, Comparator.comparing(Card::getRankInt));
    }

    public void sortDeckBySuitThenRank() {
        Collections.sort(deck, Comparator.comparing(Card::getSuit).thenComparing(Card::getRankInt));
    }

}

package com.company.etactics;

import java.util.List;

//Create a "Card" object with fields "Suit" and "Rank"
public class Card {
    private List<String> rank;
    private String suit;


    public Card(List<String> rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }


    public String getRankString() {
        return rank.get(0);
    }

    public int getRankInt() {
        return Integer.parseInt(rank.get(1));
    }



    public String getSuit() {
        return suit;
    }

}

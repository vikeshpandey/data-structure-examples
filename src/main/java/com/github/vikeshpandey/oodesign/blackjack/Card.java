package com.github.vikeshpandey.oodesign.blackjack;

public class Card {

    private boolean available = true;
    private int value;
    private Suit suit;

    public Card(final int value, final Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void makeAvailable() {
        available = true;
    }

    public void makeUnavailable() {
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }
}

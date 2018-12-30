package com.github.vikeshpandey.oodesign.blackjack;

public enum Suit {
    CLUB(0), HEART(1), SPADE(2), DIAMOND(3);

    private final int value;

    Suit(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

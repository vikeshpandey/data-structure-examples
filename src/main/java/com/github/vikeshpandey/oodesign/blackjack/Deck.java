package com.github.vikeshpandey.oodesign.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private static final int SIZE = 52;
    private List<Card> cards;


    public Deck() {
        this.cards = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards.add(new Card(j, Suit.CLUB));
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int j = 52; j > 0; j--) {
            int newPosition = random.nextInt(52);
            Card currentCard = cards.get(j);
            Card otherCard = cards.get(newPosition);
            cards.add(newPosition, currentCard);
            cards.add(j, otherCard);
        }
    }

    public Card pickCard() {
        //TODO:: incomplete
        return null;
    }

    public List<Card> availableCards() {
        //TODO: complete the method
        return null;
    }
}

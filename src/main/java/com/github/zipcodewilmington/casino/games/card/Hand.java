package com.github.zipcodewilmington.casino.games.card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    Hand dealer;
    Hand player;

    public Hand() {
        this.initializeHand();



    }

    private void initializeHand() {
        }


    public ArrayList<Card> getCards() {
        return cards;
    }



//    public void setHand(int hand) {
//        this.hand = hand;
//    }

    private ArrayList<Card> cards;

    private int getHand() {
        List<Integer> totals = new ArrayList<>();
        totals.add(0);

        for (Card card : cards) {
            List<Integer> newTotals = new ArrayList();
            for (int score : totals) {
                newTotals.add(card.getValue() + score);
                if (card.getValue() == 1) {
                    newTotals.add(11 + score);
                }
            }
            totals = newTotals;
        }
        return this.getHand();
    }

        public void Hand(){
//            this.cards = new ArrayList<Card>();
//            this.cards.add(c1);
//            this.cards.add(c2);

        }




    }




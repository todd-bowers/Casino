package com.github.zipcodewilmington.casino.games.card;

import com.github.zipcodewilmington.casino.games.card.deck.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Shoe extends Deck {
    private List<Card> allCards = new ArrayList<>();

    public Shoe(){
        this.initializeCards();
    }

    public void initializeCards(){
        for(int i = 0; i < 6; i++){
            Deck deck = new Deck();
            this.allCards.addAll(deck.getDeck());
        }
    }

    public List<Card> getAllCards() {
        return allCards;
    }

    //        ArrayList<Deck> shoe = new ArrayList<>(312);
//
//    for(int i = 0; i < 7; i++)
//
//        {
//            shoe.add(newDeck);
//
//        }
}


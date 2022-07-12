package com.github.zipcodewilmington.casino.games.card.deck;

import com.github.zipcodewilmington.casino.games.card.Card;
import com.github.zipcodewilmington.casino.games.card.Rank;
import com.github.zipcodewilmington.casino.games.card.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck extends Card {
    private final ArrayList<Object> deck;
    private ArrayList<Card> cards;
    private Deck comingFrom;
    private Card addCard;
    
//    public Deck(){
//        this.cards = new ArrayList<Card>();
//        this.shuffle();
//    }

//
//        List<Cards> Deck;
//        for (int i = 0; i < Rank.values().length; i++) {
//            for (int j = 0; j < 4; j++) {
//                deck.add(new Cards(Suit.values()[j], Rank.values()[i]));
//            }
//        }

        public void shuffle(){
            ArrayList<Card> tempDeck = new ArrayList<Card>();
            Random random = new Random();
            int randomCard = 0;
            int origSize = this.cards.size();
            for (int i = 0; i < origSize; i++){
                randomCard = random.nextInt(this.cards.size() - 1);
                tempDeck.add(this.cards.get(randomCard));
                this.cards.remove(randomCard);
            }
            this.cards = tempDeck;

        }
    public void removeCard(int i){
            this.cards.remove(i);
}
        public Card getCard(int i){
            return this.cards.get(i);
        }

        public void addCard(Card addCard){
            this.addCard = addCard;
            this.cards.add(addCard);
        }

        public void draw(Deck comingFrom){
            this.comingFrom = comingFrom;
            this.cards.add(comingFrom.getCard(0));
            comingFrom.removeCard(0);
        }


    public Deck(Suit suit, Rank rank) {
        super(suit, rank);
        deck = new ArrayList<>();
    }

}

//package com.github.zipcodewilmington.casino.games.card;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Hand {
//    private ArrayList<Card> hand  = new ArrayList<>();
//    private int numOfCards;
//
//    public Hand() {
//        this.emptyHand();
//    }
//
//        public void emptyHand(){
//            for(int i = 0, i < 10; i++){
//                this.hand[i] = null;
//            }
//        }
//
//        public boolean addCard(Card aCard){
//        if(this.numOfCards == 10){
//            System.exit(1);
//        }
//        this.hand.set(this.numOfCards, aCard);
//        this.numOfCards++;
//
//        }
//
//        return (this.getHandSum() <= 21);
//
//    public int getHandSum(){
//        int handSum = 0;
//        int cardNum;
//        int numAces = 0;
//
//        for (int i = 0; i < this.numOfCards; i++) {
//            cardNum = this.hand[i].getNumber();
//
//            if (cardNum == 1) {
//                numAces++;
//                handSum += 11;
//            } else if (cardNum > 10) {
//                handSum += 10;
//            } else {
//                handSum += cardNum;
//            }
//        }
//            return handSum;
//        }
//
//
//
//    }
//
//
//
//}
//
//
//

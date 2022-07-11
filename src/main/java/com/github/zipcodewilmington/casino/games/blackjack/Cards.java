package com.github.zipcodewilmington.casino.games.blackjack;

public class Cards {

    private Suit suit;
    private Rank rank;
    private Rank rankValue;
    private String rankName;

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Rank getRankValue() {
        return rankValue;
    }



    public Cards(Suit suit, Rank rank, Rank rankValue){
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rankValue;
    }

    public String toString(){
        return (rank + " of " + suit + this.getRankValue());
    }

    public enum Suit {
        CLUB("Clubs"),
        DIAMOND("Diamonds"),
        HEART("Hearts"),
        SPADE("Spades");

        String suitName;

        Suit(String suitName) {
            this.suitName = suitName;
        }

        public String toString() {
            return suitName;
        }
    }

        public enum Rank {
            ACE("Ace", 11),
            TWO("Two", 2),
            THREE("Three", 3),
            FOUR("Four", 4),
            FIVE("Five", 5),
            SIX("Six", 6),
            SEVEN("Seven", 7),
            EIGHT("Eight", 8),
            NINE("Nine", 9),
            TEN("Ten", 10),
            JACK("Jack", 10),
            QUEEN("Queen", 10),
            KING("King", 10);


            private final String rankName;
            private final int rankValue;

            Rank(String rankName,
                 int rankValue){
                this.rankName = rankName;
                this.rankValue = rankValue;
            }
        }

            {
                this.rankName = rankName;
                this.rankValue = rankValue;
            }

            public String getRankName() {
                return rankName;
            }


            }




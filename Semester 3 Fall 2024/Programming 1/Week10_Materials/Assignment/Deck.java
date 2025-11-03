package Week10_Materials.Assignment;

public class Deck {
    private Card[] deck = new Card[54]; //Array of 54 cards: 52 refular cards and 2 jokers

    public Deck(){ //Takes no parameters and creates 54 cards
        int cardCounter = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                deck[cardCounter] = new Card(j, i);
                cardCounter++;
            }
        }
        deck[52] = new Card(1, 5);
        deck[53] = new Card(2, 5);
    }

    public void shuffle(){ //Shuffles cards
        for (int i = deck.length - 1; i > 0; i--){
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck [rand];
            deck[rand] = temp;
        }
    }

    public Card dealCard(int index){ //
        return deck[index];
    }
}

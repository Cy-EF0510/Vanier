package Lab;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cardGuess;
        int cardPick;
        String cardDealt;

        Deck deck = new Deck();
        //System.out.println(deck.dealCard(53)); //this lines checks if the joker cards are working.
        
        deck.shuffle();

        System.out.println("Guess a card");
        cardGuess = input.nextLine();

        while (cardGuess.equalsIgnoreCase("Joker")) { //While loop to force user to not enter joker as the card guessed
            if (cardGuess.equalsIgnoreCase("Joker")) {
                System.out.println("Cannot guess Joker.");
            }
            System.out.println("Guess a card");
            cardGuess = input.nextLine();
        }

        System.out.println("You have guessed " + cardGuess);

        for (int i = 6; i > 0; i--) { // Player has 6 tries in total
            deck.shuffle();
            System.out.println("Pick a card from the deck: (input a number between 0 - 53)");
            cardPick = input.nextInt();
            System.out.println("You have picked " + deck.dealCard(cardPick));
            cardDealt = deck.dealCard(cardPick).toString(); // Converts object into string so that we can later compare it to the guessed card
            input.nextLine();
            System.out.println("You have " + (i - 1) + " tries"); // Shows how many tries player has left
            System.out.println();
            if (cardGuess.equalsIgnoreCase(cardDealt) || cardDealt.equalsIgnoreCase("Joker")) { //If player guesses right or picks a joker, they win
                System.out.println("You won the game!");
                break;
            }
        }

    }
}

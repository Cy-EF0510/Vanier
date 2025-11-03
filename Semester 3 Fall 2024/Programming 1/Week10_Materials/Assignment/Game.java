package Week10_Materials.Assignment;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cardGuess;
        int cardPick;
        String cardDealt;
        Deck deck = new Deck();
        
            for(int i = 6; i > 0; i--){ //Player has 6 tries in total
                deck.shuffle();
                System.out.println("Guess a card");
                cardGuess = input.nextLine();
                System.out.println("You have guessed " + cardGuess);
                System.out.println("Pick a card from the deck: (input a number between 0 - 53)");
                cardPick = input.nextInt();
                System.out.println("You have picked " + deck.dealCard(cardPick));
                cardDealt = deck.dealCard(cardPick).toString();
                input.nextLine();
                if(cardGuess.equalsIgnoreCase("Joker")){
                    System.out.println("Cannot guess Joker.");
                }
                    System.out.println("You have " + (i - 1) + " tries");
                    System.out.println();
                if (cardGuess.equalsIgnoreCase(cardDealt) || cardDealt.equals("Joker")){
                    System.out.println("You won the game!");
                    break;
                }
            }
        }
    }


package Week5_Materials.Assignment;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numRolled1, numRolled2, numTotal;
        int rounds = 3;

        /*The following for loop indicates that, within the number of rounds: 
         * if you win, it will stop the loop and congratulate you;
         * if you end up losing, it will announce it to you.
         * 
         * i added an extra round (rounds + 1) so that after the final round
         * it will say that you lose
         */
        for(int i = 1; i <= rounds + 1; i++){ 
            if(i == rounds + 1){
                System.out.println("You have lost the game!");
            }
            else{
                System.out.println("Round " + i);
                System.out.print("Please input your first guess: ");
                int guess1 = input.nextInt();
                System.out.print("Please input your second guess: ");
                int guess2 = input.nextInt();

                numRolled1 = (int) (Math.random() * 6) + 1;
                numRolled2 = (int) (Math.random() * 6) + 1;
                numTotal = numRolled1 + numRolled2;

                System.out.println("The first die comes up " + numRolled1);
                System.out.println("The second die comes up " + numRolled2);
                System.out.println("Your total roll is " + numTotal);

                if(guess1 == numRolled1 && guess2 == numRolled2 || guess1 == numRolled2 && guess2 == numRolled1){
                    System.out.println("Congratulations! You have won the game");
                    break;
                } 
                else if(numRolled1 == numRolled2){
                    System.out.println("Congratulations, your first roll is the same as your second roll! You have won the game");
                    break;
                }
                else if(numTotal == 6){
                    System.out.println("Congratulations, you rolled a total of 6! You have won the game");
                    break;
                }
                else if(i < rounds){
                    System.out.println("Onto the next round!" + "\n");
                }
            
            }
        }
    }
}

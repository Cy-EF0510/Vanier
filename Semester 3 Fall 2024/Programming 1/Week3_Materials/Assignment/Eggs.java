package Assignment;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputEgg, grossEgg, dozenEgg, remainingEgg;

        System.out.print("Please input the amount of eggs you have: ");
        inputEgg = input.nextInt();

        grossEgg = inputEgg / 144;
        dozenEgg = (inputEgg - (grossEgg * 144)) / 12;
        remainingEgg = inputEgg % 12;

        System.out
                .println("Your number of eggs is " + grossEgg + " gross, " + dozenEgg + " dozen, and " + remainingEgg);
    }
}

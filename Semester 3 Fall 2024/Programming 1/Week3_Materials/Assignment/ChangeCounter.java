package Assignment;

import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quarterCoin, dimeCoin, nickelCoin, pennyCoin, totalAmount;
        double quarterAmount, dimeAmount, nickelAmount, pennyAmount;

        System.out.print("How many quarters do you have? ");
        quarterCoin = input.nextDouble();
        System.out.print("How many dimes do you have? ");
        dimeCoin = input.nextDouble();
        System.out.print("How many nickels do you have? ");
        nickelCoin = input.nextDouble();
        System.out.print("How many pennies do you have? ");
        pennyCoin = input.nextDouble();

        // The following lines will convert the number of x coins user has into dollars
        quarterAmount = quarterCoin * 0.25;
        dimeAmount = dimeCoin * 0.10;
        nickelAmount = nickelCoin * 0.05;
        pennyAmount = pennyCoin * 0.01;

        totalAmount = quarterAmount + dimeAmount + nickelAmount + pennyAmount;

        System.out.println("Your amount in dollars is $" + totalAmount);
    }
}

package Lab;

import java.util.Scanner;

public class Interest2Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double initialInvestment; // The value of the investment.
        double annualRate; // The annual interest rate.
        double earnedInterest; // The interest earned during the year.
        double finalAmount; // Stores the final value of the investment after one year

        System.out.print("Enter the initial investment: ");
        initialInvestment = input.nextDouble();
        System.out.print("Enter the annual interest rate (as a decimal): ");
        annualRate = input.nextDouble();

        System.out.printf("You have entered $%1.2f as your initial investment%n", initialInvestment);
        System.out.printf("You have entered $%1.2f as your annual rate%n", annualRate);

        earnedInterest = initialInvestment * annualRate; // Compute this year's Interest.
        finalAmount = initialInvestment + earnedInterest; // Add it to initialInvestment.

        System.out.printf("The amount of interest is $%1.2f%n", earnedInterest);
        System.out.printf("The value after one year is $%1.2f%n", finalAmount);
    }
}

package Lab;

/**
 * This class implements a simple program that will compute
 * the amount of interest that is earned on an investment over
 * a period of one year. The initial amount of the investment
 * and the interest rate are input by the user. The value of
 * the investment at the end of the year is output. The
 * rate must be input as a decimal, not a percentage (for
 * example, 0.05 rather than 5).
 */
public class Interest2 {
    public static void main(String[] args) {
        double initialInvestment; // The value of the investment.
        double annualRate; // The annual interest rate.
        double earnedInterest; // The interest earned during the year.
        double finalAmount; // Stores the final value of the investment after one year

        System.out.print("Enter the initial investment: ");
        initialInvestment = TextIO.getlnDouble();
        System.out.print("Enter the annual interest rate (as a decimal): ");
        annualRate = TextIO.getlnDouble();

        System.out.printf("You have entered $%1.2f as your initial investment%n", initialInvestment);
        System.out.printf("You have entered $%1.2f as your annual rate%n", annualRate);

        earnedInterest = initialInvestment * annualRate; // Compute this year's interest.
        finalAmount = initialInvestment + earnedInterest; // Add it to principal.

        System.out.printf("The amount of interest is $%1.2f%n", earnedInterest);
        System.out.printf("The value after one year is $%1.2f%n", finalAmount);
    } // end of main()
} // end of class Interest2
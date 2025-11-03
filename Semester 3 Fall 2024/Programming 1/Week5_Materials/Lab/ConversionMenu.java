package Week5_Materials.Lab;

import java.util.Scanner;

public class ConversionMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;


        System.out.println("Please enter what conversion operation you would like to do: \n" +
        "1 for meters to feet\n" + 
        "2 for CAD to USD\n" + 
        "3 for Celsius to Fahrenheit\n" + 
        "4 for kilogram to pounds\n" + 
        "5 for atmosphere to pascals");
        option = input.nextInt();

        switch (option) {
            case 1:
                double meters;
                System.out.print("Please enter the amount of meters you would like to convert in feet: ");
                meters = input.nextDouble();
                metersToFeet(meters);
                break;
            case 2:
                double CAD;
                System.out.print("Please enter the amount of CAD you would like to convert in USD: ");
                CAD = input.nextDouble();
                cadToUSD(CAD);
                break;
            case 3:
                double celsius;
                System.out.print("Please enter the amount of degrees Celsius you would like to convert in degrees Fahrenheit: ");
                celsius = input.nextDouble();
                celsiusToFahrenheit(celsius);
                break;
            case 4:
                double kg;
                System.out.print("Please enter the amount of kilograms you would like to convert in pounds: ");
                kg = input.nextDouble();
                kgToLB(kg);             
                break;
            case 5:
                double atm;
                System.out.print("Please enter the amount of atmosphere you would like to convert in pascals: ");
                atm = input.nextDouble();
                atmToPascals(atm);
                break;
        }
    }

    //These are the methods that help convert x to y

    public static void metersToFeet(double meters){
        double distConversion = 3.280839895;
        double feet = meters * distConversion;
        System.out.printf("You have %1.2f feet", feet);
    }

    public static void cadToUSD(double cad){
        double moneyConversion = 0.73578785;
        double usd = cad * moneyConversion;
        System.out.printf("You have %1.2f USD", usd);
    }

    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("You have %1.2f degrees fahrenheit", fahrenheit);
    }

    public static void kgToLB(double kg){
        double weightConversion = 2.20462262185;
        double lb = kg * weightConversion;
        System.out.printf("You have %1.2f pounds", lb);
    }

    public static void atmToPascals(double atm){
        double pressureConversion = 101325;
        double pa = atm * pressureConversion;
        System.out.printf("You have %1.2f pascals", pa);
    }
}

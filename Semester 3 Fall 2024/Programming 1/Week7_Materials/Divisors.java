import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number to know its divisors: ");
        int number = input.nextInt();
        int counter = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("You have " + counter + " divisors");
    }
}

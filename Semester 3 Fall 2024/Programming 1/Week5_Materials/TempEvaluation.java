package Week5_Materials;

import java.util.Scanner;

public class TempEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;

        System.out.print("please enter a temperature: ");
        temperature = input.nextInt();
        if (temperature < 50){
            System.out.println("It's cold.");
        }
        else if (temperature < 80){
            System.out.println("It's nice.");
        }    
        else{
            System.out.println("It's hot.");
        }
    }
}

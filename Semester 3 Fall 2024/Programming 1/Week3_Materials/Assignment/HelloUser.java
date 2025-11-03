package Assignment;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;

        System.out.print("Hello user, please enter your name: ");
        username = input.nextLine();

        System.out.println("Hello " + username.toUpperCase() + ", nice to meet you!");
    }
}

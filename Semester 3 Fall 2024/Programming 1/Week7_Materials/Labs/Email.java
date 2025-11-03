package Labs;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Please enter your email address: ");
        String email = input.nextLine();
        if(email.matches("[A-Aa-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")){
            System.out.println("This is a valid email address");
        }
        else if(email.matches("[A-Aa-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Aa-z]")){
            System.out.println("This is a valid email address");
        }
        else{
            System.out.println("This is not a valid email address");
        }
    }
}


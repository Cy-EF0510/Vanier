package Assignment;

import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullName, firstName, lastName, nameInitials;

        System.out.println("Please enter your first name and last name, seperated by a space.");
        System.out.print("? ");
        fullName = input.nextLine();

        firstName = fullName.substring(0, fullName.indexOf(" "));
        lastName = fullName.substring(fullName.indexOf(" ") + 1);
        nameInitials = firstName.substring(0, 1) + lastName.substring(0, 1);

        System.out.println("Your first name is " + firstName + " , which has " + firstName.length() + " characters");
        System.out.println("Your first name is " + lastName + " , which has " + lastName.length() + " characters");
        System.out.println("Your initials are " + nameInitials);
    }
}

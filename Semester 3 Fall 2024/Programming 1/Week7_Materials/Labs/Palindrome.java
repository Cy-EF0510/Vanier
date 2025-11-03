package Labs;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in a palindrome: ");
        String userInput = input.nextLine();
        String removeSpace = userInput.replaceAll("\\s+", "");
        String removePunctuation = removeSpace.replaceAll("\\p{Punct}", "");
        String palindrome = removePunctuation.toLowerCase();
        System.out.println(palindrome);

        if(palindrome.charAt(0) == palindrome.charAt(palindrome.length() - 1)){
            System.out.print(palindrome.charAt(0) + " ");
            System.out.println(palindrome.charAt(palindrome.length() - 1));
            for(int i = 1; i < palindrome.length(); i++){
                System.out.print(palindrome.charAt(i) + " ");
                System.out.println(palindrome.charAt(palindrome.length() - (i + 1)));
                if(palindrome.charAt(i) == palindrome.charAt(palindrome.length() - (i + 1))){
                    continue;
                }
                else{
                    System.out.println("Not a palindrome");
                    break;
                }
            }
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome.");
        }
    }
}
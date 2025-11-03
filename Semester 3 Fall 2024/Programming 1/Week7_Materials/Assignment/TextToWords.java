package Assignment;

import java.util.Scanner;

public class TextToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String text = input.nextLine();
        //String finalChange = text.replaceAll("\\p{Punct}", ""); This is another way of doing it, but "that" and "'s" are separate
        String change1 = text.replaceAll(",", ""); //Removes commas
        String change2 = change1.replaceAll("\"", ""); //Removes quotes
        String change3 = change2.replaceAll("\\.", "");//Removes periods
        System.out.println(change3);
        int oldIndex = 0;
        for(int i = 0; i < change3.length(); i++){
            System.out.print(change3.charAt(i));
            if(change3.charAt(i) == ' '){
                System.out.println();
            }
        }
    }
}

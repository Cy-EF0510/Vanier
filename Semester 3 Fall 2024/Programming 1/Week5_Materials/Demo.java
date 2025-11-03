package Week5_Materials;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*dayNum is an integer that represents day of the week.
         * 1 to 5 is considered weekdays,
         * 6 and 7 are weekend numbers
         */
        System.out.println("please enter the number of your day");
        int dayNum = input.nextInt();
        if(dayNum >= 1 && dayNum <=5){
            System.out.println("This is a weekend");
        } 
        else if(dayNum >= 6 && dayNum <= 7){
            System.out.println("This is a weekend");
        }
        else{
            System.out.println("Error: try again; Please choose a number between 1-7");
        }
    }
    

}

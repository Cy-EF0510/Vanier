import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nameList; //initialize the array
        nameList = new String[4]; //Set the size/length
        System.out.println("Please enter your 4 favourite names");
        for(int i = 0; i < nameList.length; i++){
            nameList[i] = input.nextLine();
        }
        System.out.println("Here are the names that you have entered");
        for(int i = 0; i < nameList.length; i++){
            System.out.println(nameList[i]);
        }
    }
}

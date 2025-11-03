import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numList= new int[4];
        int Max = 0;
        System.out.println("Please enter the number you want in your list");
        for(int i = 0; i < numList.length; i++){
            numList[i] = input.nextInt();
        } 
        for(int i = 0; i < numList.length; i++){
            if(numList[i] > Max){
                Max = numList[i];
            }
        }
        System.out.println(Max + " is the highest number");
    }
}

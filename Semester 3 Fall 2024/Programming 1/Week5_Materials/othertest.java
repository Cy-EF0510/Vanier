package Week5_Materials;
import java.util.Scanner;
public class othertest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNum = input.nextInt();

        switch(dayNum){
            case 1 -> System.out.println("This number represents Monday");
            case 2 -> System.out.println("This number represents Monday");
            case 3 -> System.out.println("This number represents Monday");
            case 4 -> System.out.println("This number represents Monday");
            case 5 -> System.out.println("This number represents Monday");
            case 6 -> System.out.println("This number represents Monday");
            case 7 ->System.out.println("This number represents Monday");
            default -> System.out.println("Please add a number between 1 - 7");
        }
    }
}

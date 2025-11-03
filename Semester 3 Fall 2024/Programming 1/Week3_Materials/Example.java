import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        int age;

        System.out.print("Enter username: ");
        userName = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.println("Username is: " + userName);
        System.out.println("You are " + age + " years old");
    }
}

package Week9_Materials;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = input.nextLine();

        int[] test = new int[3];
        Student student1 = new Student(name);
        for(int i = 0; i < test.length; i++){
            System.out.println("Enter your test score: ");
            test[i] = input.nextInt();
        }
        System.out.println("Student name: " + student1.getName());
        student1.setTest1(test[0]);
        student1.setTest2(test[1]);
        student1.setTest3(test[2]);

        //calculate the average

        System.out.println(student1.testAvg());
    }
}

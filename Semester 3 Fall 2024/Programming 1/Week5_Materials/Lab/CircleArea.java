package Week5_Materials.Lab;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        double area; 

        System.out.println("Please input the radius of your circle");
        radius = input.nextDouble();

        if(radius <= 0){
            System.out.println("Cannot calculate. Radius should be higher than 0");
        }
        else{
            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Your circle area is %1.2f", area);
        }
    }
}

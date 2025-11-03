package Assignment;

import java.util.Scanner;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your expression: ");
        String expression = input.nextLine();
        evaluate(expression);
        
    }
    
    public static void evaluate(String expression){
        String operand1 = null, operand2 = null;
        double num1 = 0, num2 = 0;

        if(expression.contains("+")){
            operand1 = expression.substring(0, expression.indexOf("+"));
            operand2 = expression.substring(expression.indexOf("+") + 1);
            num1 = Double.parseDouble(operand1);
            num2 = Double.parseDouble(operand2);

            System.out.println(num1);
            System.out.println(num2);

            if(num1 == 0){
                System.out.println("Please enter a number other than 0 for your first number.");
            }
            else{
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
        }
        
        else if(expression.contains("-")){
            operand1 = expression.substring(0, expression.indexOf("-"));
            operand2 = expression.substring(expression.indexOf("-") + 1);
            num1 = Double.parseDouble(operand1);
            num2 = Double.parseDouble(operand2);

            System.out.println(num1);
            System.out.println(num2);

            if(num1 == 0){
                System.out.println("Please enter a number other than 0 for your first number.");
            }
            else{
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
        }
        else if(expression.contains("*")){
            operand1 = expression.substring(0, expression.indexOf("*"));
            operand2 = expression.substring(expression.indexOf("*") + 1);
            num1 = Double.parseDouble(operand1);
            num2 = Double.parseDouble(operand2);

            System.out.println(num1);
            System.out.println(num2);

            if(num1 == 0){
                System.out.println("Please enter a number other than 0 for your first number.");
            }
            else{
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
        }
        else if(expression.contains("/")){
            operand1 = expression.substring(0, expression.indexOf("/"));
            operand2 = expression.substring(expression.indexOf("/") + 1);
            num1 = Double.parseDouble(operand1);
            num2 = Double.parseDouble(operand2);

            System.out.println(num1);
            System.out.println(num2);

            if(num1 == 0){
                System.out.println("Please enter a number other than 0 for your first number.");
            }
            else{
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
    }
}

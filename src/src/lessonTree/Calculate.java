package src.lessonTree;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double result;

        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /) exit program input - exit: ");
        operation = scanner.next();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextDouble();
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "exit":
                System.out.println("You input exit program. Goodbye!");
                return;
            default:
                System.out.println("Error!");
                return;
        }
        System.out.println("The result: ");
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}

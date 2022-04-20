package src.lessonTwo;

import java.util.Scanner;

public class Monobank {

    public static void main(String[] args) {

        String name;
        String surname;
        Scanner scanner = new Scanner(System.in);
        int depositSum;
        double percent = 0.07;
        double accumulationSum;
        System.out.println("Hello! Glad to see you in our bank!");
        System.out.println("Please input your name");
        name = scanner.nextLine();
        System.out.println("Please input your surname");
        surname = scanner.nextLine();
        System.out.println("Dear " + name + " " + surname + " please input deposit sum");
        depositSum = scanner.nextInt();
        accumulationSum = depositSum + (depositSum * percent);
        System.out.println("Dear " + name + " " + surname + " when depositing " + depositSum +
                " for a year, your deposit will be: " + accumulationSum);
        System.out.println("Over five years, your deposit will be: " + accumulationSum * 5);
        System.out.println("Over ten years, your deposit will be: " + accumulationSum * 10);
        System.out.println("Goodbye! We will be glad to see you in our bank");
    }
}

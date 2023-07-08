package hm1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a number");

            try {
                int number = scanner.nextInt();
                System.out.println(reverseString(number));
            } catch (InputMismatchException e) {
                System.out.println("Input Error. Enter a number.");
                scanner.nextLine();
            }
        } while (true);
    }


    private static String reverseString(int number) {
        return new StringBuilder(String.valueOf(number)).reverse().toString();
    }
}
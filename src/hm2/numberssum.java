package hm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numberssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number: ");

                try {
                    int number = scanner.nextInt();
                    sum += number;
                } catch (InputMismatchException e) {
                    System.out.println("Input Error.Enter a number.");
                    scanner.nextLine();
                    i--;
                }
            }

            System.out.println("Sum numbers: " + sum);
        }
    }
}
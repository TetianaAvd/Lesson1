package hm2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            String input = scanner.nextLine();

            String[] numbers = input.split(" ");
            int sum = 0;

            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }


            System.out.println("Sum numbers: " + sum);
        } while (true);
    }
}

package hm2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class numberssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");

            String input = scanner.nextLine();

            String[] numbers = input.split(" ");

            int[] array = Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = Arrays.stream(array).sum();


            System.out.println("Sum numbers: " + sum);
        }
        while (true);
    }
}
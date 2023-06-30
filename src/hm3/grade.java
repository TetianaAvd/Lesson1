package hm3;

import java.util.Scanner;

public class grade {
    public enum Grade {
        A(91, 100),
        B(81, 90),
        C(71, 80),
        D(61, 70),
        E(0, 60);

        private final int lowerBound;
        private final int upperBound;

        Grade(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public boolean isInRange(int grade) {
            return grade >= lowerBound && grade <= upperBound;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("student’s grade: ");
        int grade = scanner.nextInt();

        for (Grade g : Grade.values()) {
            if (g.isInRange(grade)) {
                System.out.println(g);
                break;
            }
        }
    }
}
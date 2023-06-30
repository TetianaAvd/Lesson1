package hm3;

import java.util.Scanner;

class Grade {
    public enum GradeValue {
        A(91, 100),
        B(81, 90),
        C(71, 80),
        D(61, 70),
        E(0, 60);

        private final int lowerBound;
        private final int upperBound;

        GradeValue(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public boolean isInRange(int grade) {

            return grade >= lowerBound && grade <= upperBound;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.print("Enter student's grade : ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                isExit = true;
            } else {
                for (GradeValue g : GradeValue.values()) {
                    if (g.isInRange(grade)) {
                        System.out.println("Grade: " + g);
                        break;
                    }
                }
            }
        }

        System.out.println("Program exited.");
    }
}
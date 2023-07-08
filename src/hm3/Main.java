package hm3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.print("Enter student's grade : ");
            int inputMark = scanner.nextInt();


            if (inputMark == -1);
            else {
                for (Grade.GradeValue grade : Grade.GradeValue.values()) {
                    if (grade.isInRange(inputMark)) {
                        System.out.println("Grade: " + grade);
                        break;
                    }
                }
            }
        }
    }
}


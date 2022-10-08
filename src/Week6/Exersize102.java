package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exersize102 {
    public static class GradeDistribution {
        private final ArrayList<Integer> grades = new ArrayList<>();
        private int accepted = 0;

        public void addScore(int score) {
            if (score <= 60) {
                if (score > 49) {
                    grades.add(5);
                    accepted++;
                } else if (score > 44) {
                    grades.add(4);
                    accepted++;
                } else if (score > 39) {
                    grades.add(3);
                    accepted++;
                } else if (score > 34) {
                    grades.add(2);
                    accepted++;
                } else if (score > 29) {
                    grades.add(1);
                    accepted++;
                } else if (score >= 0) {
                    grades.add(0);
                }
            }
        }

        public double acceptancePercentage() {
            if (!grades.isEmpty()) {
                return 100d * accepted/grades.size();
            }
            return 0;
        }

        public void printGrades() {
            System.out.println("Grade distribution:");
            for (int target = 5; target >= 0; target--) {
                System.out.print(target + ": ");

                for (int g: grades) {
                    if (g == target) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            System.out.println("Acceptance percentage: " + acceptancePercentage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDistribution dist = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes: ");
        int score = scanner.nextInt();
        while (score != -1) {
            dist.addScore(score);
            score = scanner.nextInt();
        }

        dist.printGrades();
    }
}

package Week4;

import Others.ScannerClass;

public class Exersize79 {
    public static class NumberStatistics {
        private int amountOfNumbers;
        private double sum;

        public NumberStatistics() {
            amountOfNumbers = 0;
            sum = 0;
        }

        public void addNumber(int number) {
            amountOfNumbers++;
            sum += number;
        }

        public int amountOfNumbers() {
            return amountOfNumbers;
        }

        public int sum() {
            return (int)sum;
        }

        public double average() {
            return sum / amountOfNumbers;
        }
    }

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();

        System.out.println("Type numbers: ");

        int input = ScannerClass.s.nextInt();
        while (input != -1) {
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
            stats.addNumber(input);
            input = ScannerClass.s.nextInt();
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}

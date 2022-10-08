package Week4;

import java.util.ArrayList;
import java.util.Random;

public class Exersize82 {
    public static class LotteryNumbers {
        private ArrayList<Integer> numbers;
        private final Random random = new Random();

        public LotteryNumbers() {
            // We'll format a list for the numbers
            this.numbers = new ArrayList<Integer>();
            // Draw numbers as LotteryNumbers is created
            this.drawNumbers();
        }

        public ArrayList<Integer> numbers() {
            return this.numbers;
        }

        public void drawNumbers() {
            int draws = 0;
            while (draws < 7) {
                int drawnNum = random.nextInt(1, 40);
                if (!containsNumber(drawnNum)) {
                    numbers.add(drawnNum);
                    draws++;
                }
            }
        }

        public boolean containsNumber(int number) {
            return numbers.contains(number);
        }
    }

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}

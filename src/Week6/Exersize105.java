package Week6;

import java.util.Scanner;

public class Exersize105 {
    public static class GuessingGame {

        private Scanner reader;

        public GuessingGame() {
            this.reader = new Scanner(System.in);
        }

        public void play(int lowerLimit, int upperLimit) {
            instructions(lowerLimit, upperLimit);

            // write the game logic here
            int middleValue = 0;
            boolean lastChoiceGreater = false;
            while (true) {
                System.out.println(lowerLimit + " " + upperLimit);
                middleValue = average(lowerLimit, upperLimit);
                if (Math.abs(upperLimit - lowerLimit) == 1) {
                    if (lastChoiceGreater) {
                        middleValue = upperLimit;
                    } else {
                        middleValue = lowerLimit;
                    }
                    break;
                }
                if (isGreaterThan(middleValue)) {
                    lowerLimit = middleValue;
                    lastChoiceGreater = true;
                } else {
                    upperLimit = middleValue;
                    lastChoiceGreater = false;
                }
            }

            System.out.println("The number you're thinking of is " + middleValue);
        }

        // implement here the methods isGreaterThan and average
        public boolean isGreaterThan(int value) {
            System.out.println("Is your number greater than " + value + "? (y/n)");
            String answer = reader.nextLine();
            switch (answer) {
                case "y": return true;
                case "n": return false;
                default: System.out.println("not an answer, assuming no"); return false;
            }
        }
        public int average(int value1, int value2) {
            int sum = 0;
            for (int i = value1; i <= value2; i++) {
                sum += i;
            }
            return sum / (value2 - value1 + 1);
        }


        public void instructions(int lowerLimit, int upperLimit) {
            int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

            System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

            System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
            System.out.println("");
            System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
            System.out.println("");
        }

        // a helper method:
        public static int howManyTimesHalvable(int number) {
            // we create a base two logarithm  of the given value
            // Below we swap the base number to base two logarithms!
            return (int) (Math.log(number) / Math.log(2)) + 1;
        }
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();

        // we play two rounds
        game.play(1,10);  // value to be guessed now within range 1-10
        game.play(10,99);  // value to be guessed now within range 10-99
    }

}

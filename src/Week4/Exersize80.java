package Week4;

import java.util.Random;

public class Exersize80 {
    public static class Dice {
        private Random random;
        private int numberOfSides;

        public Dice(int numberOfSides){
            this.numberOfSides = numberOfSides;
            random = new Random();

        }

        public int roll() {
            return random.nextInt(1, numberOfSides);
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
}

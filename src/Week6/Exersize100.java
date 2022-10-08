package Week6;

import java.util.Random;

public class Exersize100 {
    public static class NightSky {
        private final double density;
        private final int width;
        private final int height;
        private int numOfStars = 0;
        private final Random random = new Random();

        public NightSky(double density, int width, int height) {
            this.density = density;
            this.width = width;
            this.height = height;
        }
        public NightSky(int width, int height) {
            this.density = 0.1d;
            this.width = width;
            this.height = height;
        }
        public NightSky(double density) {
            this.density = density;
            this.width = 20;
            this.height = 10;
        }

        public void printLine() {
            for (int w = 0; w < width; w++) {
                float chance = random.nextFloat();
                if (chance <= density) {
                    System.out.print("*");
                    numOfStars++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        public void print() {
            for (int h = 0; h < height; h++) {
                printLine();
            }
        }

        public int starsInLastPrint() {
            return numOfStars;
        }
    }

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}

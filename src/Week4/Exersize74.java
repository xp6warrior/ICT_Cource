package Week4;

public class Exersize74 {
    public static class Multiplier {
        private final int factor;
        public Multiplier(int factor) {
            this.factor = factor;
        }

        public int multiply(int number) {
            return number * factor;
        }
    }

    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}

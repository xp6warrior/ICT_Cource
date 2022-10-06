package Week4;

public class Exersize75 {
    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private final int initialValue;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.initialValue = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            if (value > 0) {
                value--;
            }
        }

        public void reset() {
            value = 0;
        }

        public void setInitial() {
            value = initialValue;
        }
    }

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}

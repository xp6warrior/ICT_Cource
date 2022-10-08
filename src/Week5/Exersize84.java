package Week5;

public class Exersize84 {

    public static class Counter {
        private final int startingValue;
        private final boolean check;
        private int value;

        public Counter(int startingValue, boolean check) {
            this.startingValue = startingValue;
            this.check = check;
            this.value = startingValue;
        }
        public Counter(int startingValue) {
            this.startingValue = startingValue;
            this.check = false;
            this.value = startingValue;
        }
        public Counter(boolean check) {
            this.startingValue = 0;
            this.check = check;
        }
        public Counter() {
            this.startingValue = 0;
            this.check = false;
        }

        public int value() {
            return this.value;
        }

        public void increase(int increment) {
            this.value += increment;
        }
        public void increase() {
            this.value++;
        }

        public void decrease(int increment) {
            this.value -= increment;
            if (check && value < 0) {
                value = 0;
            }
        }
        public void decrease() {
            this.value--;
            if (check && value < 0) {
                this.value = 0;
            }
        }
    }
}

package Week4;

import java.util.Scanner;

public class Exersize78 {
    public static class BoundedCounter {
        private int value;
        private int upperLimit;

        public BoundedCounter(int upperLimit) {
            this.upperLimit = upperLimit;
        }

        public void next() {
            value++;
            if (value > upperLimit) {
                value = 0;
            }
        }

        public String toString() {
            String result = "";
            if (value < 10) {
                result = "0";
            }
            return result + value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            if (value >= 0 && value <= upperLimit) {
                this.value = value;
            }
        }
    }

    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("seconds: ");
        int s = reader.nextInt();
        System.out.println("minutes: ");
        int m = reader.nextInt();
        System.out.println("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }


            i++;
        }

    }
}

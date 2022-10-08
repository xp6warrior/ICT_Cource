package Week5;

import Week4.Exersize78;

public class Exersize89 {
    public static class Clock {
        private Exersize78.BoundedCounter hours;
        private Exersize78.BoundedCounter minutes;
        private Exersize78.BoundedCounter seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
            hours = new Exersize78.BoundedCounter(23);
            minutes = new Exersize78.BoundedCounter(59);
            seconds = new Exersize78.BoundedCounter(59);

            hours.setValue(hoursAtBeginning);
            minutes.setValue(minutesAtBeginning);
            seconds.setValue(secondsAtBeginning);
        }

        public void tick(){
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }

        public String toString() {
            return hours + ":" + minutes + ":" + seconds;
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }

}

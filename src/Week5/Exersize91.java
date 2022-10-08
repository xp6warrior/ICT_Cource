package Week5;

public class Exersize91 {
    public static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }

        public boolean earlier(MyDate compared) {
            // first we'll compare years
            if ( this.year < compared.year ) {
                return true;
            }

            // if the years are the same, we'll compare the months
            if ( this.year == compared.year && this.month < compared.month ) {
                return true;
            }

            // years and months the same, we'll compare the days
            if ( this.year == compared.year && this.month == compared.month &&
                    this.day < compared.day ) {
                return true;
            }

            return false;
        }

        public void advance() {
            day++;
            if (day == 31) {
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                }
            }
        }
        public void advance(int numberOfDays) {
            for (int i = 0; i < numberOfDays; i++) {
                advance();
            }
        }

        public MyDate afterNumberOfDays(int days){
            MyDate newMyDate = new MyDate(day, month, year);

            newMyDate.advance(days);

            return newMyDate;
        }
    }

    public static void main(String[] args) {
        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
    }
}

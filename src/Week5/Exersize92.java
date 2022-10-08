package Week5;

public class Exersize92 {
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

        public int differenceInYears(MyDate compareDate, boolean days) {
            MyDate bigger;
            MyDate smaller;

            if (this.earlier(compareDate)) {
                bigger = compareDate;
                smaller = this;
            } else {
                bigger = this;
                smaller = compareDate;
            }

            int dyear = bigger.year - smaller.year;
            int dmonth = bigger.month + 12*dyear - smaller.month;
            int dday = bigger.day + 30*dmonth - smaller.day;

            if (days) {
                return dday;
            }

            return dday / 360;
        }
    }

    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first, false) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second, false) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first, false) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third, false) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third, false) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second, false) );
    }
}

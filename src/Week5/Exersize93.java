package Week5;

import java.util.Calendar;

public class Exersize93 {
    public static class Person {
        private String name;
        private Exersize92.MyDate birthday;

        private final int dayT = Calendar.getInstance().get(Calendar.DATE);
        private final int monthT = Calendar.getInstance().get(Calendar.MONTH) + 1;
        private final int yearT = Calendar.getInstance().get(Calendar.YEAR);
        private final Exersize92.MyDate today = new Exersize92.MyDate(dayT, monthT, yearT);

        public Person(String name, int pp, int kk, int vv) {
            this.name = name;
            this.birthday = new Exersize92.MyDate(pp, kk, vv);
        }
        public Person(String name, Exersize92.MyDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }
        public Person(String name) {
            this.name = name;
            this.birthday = today;
        }

        public int age() {
            return birthday.differenceInYears(today, true);
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name +", born "+ this.birthday;
        }

        public boolean olderThan(Person compared) {
            int thisAge = this.age();
            int comparedAge = compared.age();
            return Math.max(thisAge, comparedAge) == thisAge;
        }
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", new Exersize92.MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}
